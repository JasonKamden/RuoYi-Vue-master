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
import com.ruoyi.system.domain.SysTaskInfo;
import com.ruoyi.system.service.ISysTaskInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务进度Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/task/info")
public class SysTaskInfoController extends BaseController
{
    @Autowired
    private ISysTaskInfoService sysTaskInfoService;

    /**
     * 查询任务进度列表
     */
    @PreAuthorize("@ss.hasPermi('task:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysTaskInfo sysTaskInfo)
    {
        startPage();
        List<SysTaskInfo> list = sysTaskInfoService.selectSysTaskInfoList(sysTaskInfo);
        return getDataTable(list);
    }

    /**
     * 导出任务进度列表
     */
    @PreAuthorize("@ss.hasPermi('task:info:export')")
    @Log(title = "任务进度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysTaskInfo sysTaskInfo)
    {
        List<SysTaskInfo> list = sysTaskInfoService.selectSysTaskInfoList(sysTaskInfo);
        ExcelUtil<SysTaskInfo> util = new ExcelUtil<SysTaskInfo>(SysTaskInfo.class);
        util.exportExcel(response, list, "任务进度数据");
    }

    /**
     * 获取任务进度详细信息
     */
    @PreAuthorize("@ss.hasPermi('task:info:query')")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") String taskId)
    {
        return success(sysTaskInfoService.selectSysTaskInfoByTaskId(taskId));
    }

    /**
     * 新增任务进度
     */
    @PreAuthorize("@ss.hasPermi('task:info:add')")
    @Log(title = "任务进度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysTaskInfo sysTaskInfo)
    {
        return toAjax(sysTaskInfoService.insertSysTaskInfo(sysTaskInfo));
    }

    /**
     * 修改任务进度
     */
    @PreAuthorize("@ss.hasPermi('task:info:edit')")
    @Log(title = "任务进度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysTaskInfo sysTaskInfo)
    {
        return toAjax(sysTaskInfoService.updateSysTaskInfo(sysTaskInfo));
    }

    /**
     * 删除任务进度
     */
    @PreAuthorize("@ss.hasPermi('task:info:remove')")
    @Log(title = "任务进度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable String[] taskIds)
    {
        return toAjax(sysTaskInfoService.deleteSysTaskInfoByTaskIds(taskIds));
    }
}
