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
import com.ruoyi.system.domain.SysMeetingApply;
import com.ruoyi.system.service.ISysMeetingApplyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会议申请Controller
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
@RestController
@RequestMapping("/meeting/apply")
public class SysMeetingApplyController extends BaseController
{
    @Autowired
    private ISysMeetingApplyService sysMeetingApplyService;

    /**
     * 查询会议申请列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysMeetingApply sysMeetingApply)
    {
        startPage();
        List<SysMeetingApply> list = sysMeetingApplyService.selectSysMeetingApplyList(sysMeetingApply);
        return getDataTable(list);
    }

    /**
     * 导出会议申请列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:export')")
    @Log(title = "会议申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysMeetingApply sysMeetingApply)
    {
        List<SysMeetingApply> list = sysMeetingApplyService.selectSysMeetingApplyList(sysMeetingApply);
        ExcelUtil<SysMeetingApply> util = new ExcelUtil<SysMeetingApply>(SysMeetingApply.class);
        util.exportExcel(response, list, "会议申请数据");
    }

    /**
     * 获取会议申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:query')")
    @GetMapping(value = "/{meetingId}")
    public AjaxResult getInfo(@PathVariable("meetingId") String meetingId)
    {
        return success(sysMeetingApplyService.selectSysMeetingApplyByMeetingId(meetingId));
    }

    /**
     * 新增会议申请
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:add')")
    @Log(title = "会议申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMeetingApply sysMeetingApply)
    {
        return toAjax(sysMeetingApplyService.insertSysMeetingApply(sysMeetingApply));
    }

    /**
     * 修改会议申请
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:edit')")
    @Log(title = "会议申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMeetingApply sysMeetingApply)
    {
        return toAjax(sysMeetingApplyService.updateSysMeetingApply(sysMeetingApply));
    }

    /**
     * 删除会议申请
     */
    @PreAuthorize("@ss.hasPermi('meeting:apply:remove')")
    @Log(title = "会议申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{meetingIds}")
    public AjaxResult remove(@PathVariable String[] meetingIds)
    {
        return toAjax(sysMeetingApplyService.deleteSysMeetingApplyByMeetingIds(meetingIds));
    }
}
