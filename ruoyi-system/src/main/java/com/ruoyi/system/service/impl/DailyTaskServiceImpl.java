package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DailyTaskMapper;
import com.ruoyi.system.domain.DailyTask;
import com.ruoyi.system.service.IDailyTaskService;

/**
 * 日常任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class DailyTaskServiceImpl implements IDailyTaskService 
{
    @Autowired
    private DailyTaskMapper dailyTaskMapper;

    /**
     * 查询日常任务
     * 
     * @param taskId 日常任务主键
     * @return 日常任务
     */
    @Override
    public DailyTask selectDailyTaskByTaskId(Long taskId)
    {
        return dailyTaskMapper.selectDailyTaskByTaskId(taskId);
    }

    /**
     * 查询日常任务列表
     * 
     * @param dailyTask 日常任务
     * @return 日常任务
     */
    @Override
    public List<DailyTask> selectDailyTaskList(DailyTask dailyTask)
    {
        return dailyTaskMapper.selectDailyTaskList(dailyTask);
    }

    /**
     * 新增日常任务
     * 
     * @param dailyTask 日常任务
     * @return 结果
     */
    @Override
    public int insertDailyTask(DailyTask dailyTask)
    {
        dailyTask.setCreateTime(DateUtils.getNowDate());
        return dailyTaskMapper.insertDailyTask(dailyTask);
    }

    /**
     * 修改日常任务
     * 
     * @param dailyTask 日常任务
     * @return 结果
     */
    @Override
    public int updateDailyTask(DailyTask dailyTask)
    {
        dailyTask.setUpdateTime(DateUtils.getNowDate());
        return dailyTaskMapper.updateDailyTask(dailyTask);
    }

    /**
     * 批量删除日常任务
     * 
     * @param taskIds 需要删除的日常任务主键
     * @return 结果
     */
    @Override
    public int deleteDailyTaskByTaskIds(Long[] taskIds)
    {
        return dailyTaskMapper.deleteDailyTaskByTaskIds(taskIds);
    }

    /**
     * 删除日常任务信息
     * 
     * @param taskId 日常任务主键
     * @return 结果
     */
    @Override
    public int deleteDailyTaskByTaskId(Long taskId)
    {
        return dailyTaskMapper.deleteDailyTaskByTaskId(taskId);
    }
}
