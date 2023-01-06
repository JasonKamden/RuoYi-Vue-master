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
import com.ruoyi.system.domain.SysAttendInfo;
import com.ruoyi.system.service.ISysAttendInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工考勤Controller
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@RestController
@RequestMapping("/office/attend")
public class SysAttendInfoController extends BaseController
{
    @Autowired
    private ISysAttendInfoService sysAttendInfoService;

    /**
     * 查询员工考勤列表
     */
    @PreAuthorize("@ss.hasPermi('office:attend:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAttendInfo sysAttendInfo)
    {
        startPage();
        List<SysAttendInfo> list = sysAttendInfoService.selectSysAttendInfoList(sysAttendInfo);
        return getDataTable(list);
    }

    /**
     * 导出员工考勤列表
     */
    @PreAuthorize("@ss.hasPermi('office:attend:export')")
    @Log(title = "员工考勤", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAttendInfo sysAttendInfo)
    {
        List<SysAttendInfo> list = sysAttendInfoService.selectSysAttendInfoList(sysAttendInfo);
        ExcelUtil<SysAttendInfo> util = new ExcelUtil<SysAttendInfo>(SysAttendInfo.class);
        util.exportExcel(response, list, "员工考勤数据");
    }

    /**
     * 获取员工考勤详细信息
     */
    @PreAuthorize("@ss.hasPermi('office:attend:query')")
    @GetMapping(value = "/{attendId}")
    public AjaxResult getInfo(@PathVariable("attendId") String attendId)
    {
        return success(sysAttendInfoService.selectSysAttendInfoByAttendId(attendId));
    }

    /**
     * 新增员工考勤
     */
    @PreAuthorize("@ss.hasPermi('office:attend:add')")
    @Log(title = "员工考勤", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAttendInfo sysAttendInfo)
    {
        return toAjax(sysAttendInfoService.insertSysAttendInfo(sysAttendInfo));
    }

    /**
     * 修改员工考勤
     */
    @PreAuthorize("@ss.hasPermi('office:attend:edit')")
    @Log(title = "员工考勤", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAttendInfo sysAttendInfo)
    {
        return toAjax(sysAttendInfoService.updateSysAttendInfo(sysAttendInfo));
    }

    /**
     * 删除员工考勤
     */
    @PreAuthorize("@ss.hasPermi('office:attend:remove')")
    @Log(title = "员工考勤", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attendIds}")
    public AjaxResult remove(@PathVariable String[] attendIds)
    {
        return toAjax(sysAttendInfoService.deleteSysAttendInfoByAttendIds(attendIds));
    }
}
