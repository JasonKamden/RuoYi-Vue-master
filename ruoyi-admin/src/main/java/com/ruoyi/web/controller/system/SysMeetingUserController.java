package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysMeetingUser;
import com.ruoyi.system.service.ISysMeetingUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户会议Controller
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@RestController
@RequestMapping("/meeting/user")
public class SysMeetingUserController extends BaseController
{
    @Autowired
    private ISysMeetingUserService sysMeetingUserService;

    /**
     * 查询用户会议列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysMeetingUser sysMeetingUser)
    {
        startPage();
        List<SysMeetingUser> list = sysMeetingUserService.selectSysMeetingUserList(sysMeetingUser);
        return getDataTable(list);
    }

    /**
     * 导出用户会议列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:export')")
    @Log(title = "用户会议", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysMeetingUser sysMeetingUser)
    {
        List<SysMeetingUser> list = sysMeetingUserService.selectSysMeetingUserList(sysMeetingUser);
        ExcelUtil<SysMeetingUser> util = new ExcelUtil<SysMeetingUser>(SysMeetingUser.class);
        util.exportExcel(response, list, "用户会议数据");
    }

    /**
     * 获取用户会议详细信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:query')")
    @GetMapping(value = "/{meetingId}")
    public AjaxResult getInfo(@PathVariable("meetingId") String meetingId)
    {
        return success(sysMeetingUserService.selectSysMeetingUserByMeetingId(meetingId));
    }

    /**
     * 新增用户会议
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:add')")
    @Log(title = "用户会议", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMeetingUser sysMeetingUser)
    {
        return toAjax(sysMeetingUserService.insertSysMeetingUser(sysMeetingUser));
    }

    /**
     * 修改用户会议
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:edit')")
    @Log(title = "用户会议", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMeetingUser sysMeetingUser)
    {
        return toAjax(sysMeetingUserService.updateSysMeetingUser(sysMeetingUser));
    }

    /**
     * 删除用户会议
     */
    @PreAuthorize("@ss.hasPermi('meeting:user:remove')")
    @Log(title = "用户会议", businessType = BusinessType.DELETE)
	@DeleteMapping("/{meetingIds}")
    public AjaxResult remove(@PathVariable String[] meetingIds)
    {
        return toAjax(sysMeetingUserService.deleteSysMeetingUserByMeetingIds(meetingIds));
    }
}
