package com.ruoyi.framework.security.handle;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.framework.config.properties.CasProperties;
import com.ruoyi.framework.web.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Description:
 * @Author: zhongyc
 * @Data: 2023-01-10 15:06
 * @Version: v1.0
 */
@Service
@Slf4j
public class CasAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {


    private RequestCache requestCache = new HttpSessionRequestCache();

    @Autowired
    private TokenService tokenService;

    @Autowired
    private CasProperties casProperties;

    /**
     * 令牌有效期（默认30分钟）
     */
    @Value("${token.expireTime}")
    private int expireTime;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {
        String targetUrlParameter = getTargetUrlParameter();
        if (isAlwaysUseDefaultTargetUrl()
                || (targetUrlParameter != null && StringUtils.hasText(request.getParameter(targetUrlParameter)))) {
            requestCache.removeRequest(request, response);
            super.onAuthenticationSuccess(request, response, authentication);
            return;
        }
        clearAuthenticationAttributes(request);
        LoginUser userDetails = (LoginUser) authentication.getPrincipal();
        String token = tokenService.createToken(userDetails);
        //往Cookie中设置token
        Cookie casCookie = new Cookie(Constants.WEB_TOKEN_KEY, token);
        casCookie.setMaxAge(expireTime * 60);
        response.addCookie(casCookie);
        //设置后端认证成功标识
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute(Constants.CAS_TOKEN, token);
        //登录成功后跳转到前端登录页面
        getRedirectStrategy().sendRedirect(request, response, casProperties.getWebUrl());
    }
}
