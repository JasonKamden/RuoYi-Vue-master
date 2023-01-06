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
import com.ruoyi.system.domain.DailyTask;
import com.ruoyi.system.service.IDailyTaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 日常任务Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/office/daily")
public class DailyTaskController extends BaseController
{
    @Autowired
    private IDailyTaskService dailyTaskService;

    /**
     * 查询日常任务列表
     */
    @PreAuthorize("@ss.hasPermi('office:daily:list')")
    @GetMapping("/list")
    public TableDataInfo list(DailyTask dailyTask)
    {
        startPage();
        List<DailyTask> list = dailyTaskService.selectDailyTaskList(dailyTask);
        return getDataTable(list);
    }

    /**
     * 导出日常任务列表
     */
    @PreAuthorize("@ss.hasPermi('office:daily:export')")
    @Log(title = "日常任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DailyTask dailyTask)
    {
        List<DailyTask> list = dailyTaskService.selectDailyTaskList(dailyTask);
        ExcelUtil<DailyTask> util = new ExcelUtil<DailyTask>(DailyTask.class);
        util.exportExcel(response, list, "日常任务数据");
    }

    /**
     * 获取日常任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('office:daily:query')")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") Long taskId)
    {
        return success(dailyTaskService.selectDailyTaskByTaskId(taskId));
    }

    /**
     * 新增日常任务
     */
    @PreAuthorize("@ss.hasPermi('office:daily:add')")
    @Log(title = "日常任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DailyTask dailyTask)
    {
        return toAjax(dailyTaskService.insertDailyTask(dailyTask));
    }

    /**
     * 修改日常任务
     */
    @PreAuthorize("@ss.hasPermi('office:daily:edit')")
    @Log(title = "日常任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DailyTask dailyTask)
    {
        return toAjax(dailyTaskService.updateDailyTask(dailyTask));
    }

    /**
     * 删除日常任务
     */
    @PreAuthorize("@ss.hasPermi('office:daily:remove')")
    @Log(title = "日常任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable Long[] taskIds)
    {
        return toAjax(dailyTaskService.deleteDailyTaskByTaskIds(taskIds));
    }
}
