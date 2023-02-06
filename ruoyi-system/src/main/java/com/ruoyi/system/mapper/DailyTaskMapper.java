package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DailyTask;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日常任务Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface DailyTaskMapper 
{
    /**
     * 查询日常任务
     * 
     * @param taskId 日常任务主键
     * @return 日常任务
     */
    public DailyTask selectDailyTaskByTaskId(Long taskId);

    /**
     * 查询日常任务列表
     * 
     * @param dailyTask 日常任务
     * @return 日常任务集合
     */
    public List<DailyTask> selectDailyTaskList(DailyTask dailyTask);

    /**
     * 新增日常任务
     * 
     * @param dailyTask 日常任务
     * @return 结果
     */
    public int insertDailyTask(DailyTask dailyTask);

    /**
     * 修改日常任务
     * 
     * @param dailyTask 日常任务
     * @return 结果
     */
    public int updateDailyTask(DailyTask dailyTask);

    /**
     * 删除日常任务
     * 
     * @param taskId 日常任务主键
     * @return 结果
     */
    public int deleteDailyTaskByTaskId(Long taskId);

    /**
     * 批量删除日常任务
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDailyTaskByTaskIds(Long[] taskIds);
}
