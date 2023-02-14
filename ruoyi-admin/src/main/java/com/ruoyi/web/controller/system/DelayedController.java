package com.ruoyi.web.controller.system;

import com.ruoyi.middleware.core.DelayedProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhongyc
 * @Data: 2023-02-14 13:14
 * @Version: v1.0
 */
@Slf4j
@RequestMapping("ttl")
@RestController
public class DelayedController {
    @Resource
    private DelayedProducer delayedProducer;

    @GetMapping("sendDelayMsg/{message}/{delayTime}")
    public void sendMsg(@PathVariable String message, @PathVariable Integer delayTime) {
        delayedProducer.sendToMessage(message,delayTime);
    }
}
