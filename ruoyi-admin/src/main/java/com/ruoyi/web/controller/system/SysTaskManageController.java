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
import com.ruoyi.system.domain.SysTaskManage;
import com.ruoyi.system.service.ISysTaskManageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/task/manage")
public class SysTaskManageController extends BaseController
{
    @Autowired
    private ISysTaskManageService sysTaskManageService;

    /**
     * 查询任务列表
     */
    @PreAuthorize("@ss.hasPermi('task:manage:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysTaskManage sysTaskManage)
    {
        startPage();
        List<SysTaskManage> list = sysTaskManageService.selectSysTaskManageList(sysTaskManage);
        return getDataTable(list);
    }

    /**
     * 导出任务列表
     */
    @PreAuthorize("@ss.hasPermi('task:manage:export')")
    @Log(title = "任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysTaskManage sysTaskManage)
    {
        List<SysTaskManage> list = sysTaskManageService.selectSysTaskManageList(sysTaskManage);
        ExcelUtil<SysTaskManage> util = new ExcelUtil<SysTaskManage>(SysTaskManage.class);
        util.exportExcel(response, list, "任务数据");
    }

    /**
     * 获取任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:manage:query')")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") String taskId)
    {
        return success(sysTaskManageService.selectSysTaskManageByTaskId(taskId));
    }

    /**
     * 新增任务
     */
    @PreAuthorize("@ss.hasPermi('task:manage:add')")
    @Log(title = "任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysTaskManage sysTaskManage)
    {
        return toAjax(sysTaskManageService.insertSysTaskManage(sysTaskManage));
    }

    /**
     * 修改任务
     */
    @PreAuthorize("@ss.hasPermi('task:manage:edit')")
    @Log(title = "任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysTaskManage sysTaskManage)
    {
        return toAjax(sysTaskManageService.updateSysTaskManage(sysTaskManage));
    }

    /**
     * 删除任务
     */
    @PreAuthorize("@ss.hasPermi('task:manage:remove')")
    @Log(title = "任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable String[] taskIds)
    {
        return toAjax(sysTaskManageService.deleteSysTaskManageByTaskIds(taskIds));
    }
}
