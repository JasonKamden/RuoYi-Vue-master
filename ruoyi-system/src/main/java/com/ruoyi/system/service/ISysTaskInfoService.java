package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysTaskInfo;

/**
 * 任务进度Service接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface ISysTaskInfoService 
{
    /**
     * 查询任务进度
     * 
     * @param taskId 任务进度主键
     * @return 任务进度
     */
    public SysTaskInfo selectSysTaskInfoByTaskId(String taskId);

    /**
     * 查询任务进度列表
     * 
     * @param sysTaskInfo 任务进度
     * @return 任务进度集合
     */
    public List<SysTaskInfo> selectSysTaskInfoList(SysTaskInfo sysTaskInfo);

    /**
     * 新增任务进度
     * 
     * @param sysTaskInfo 任务进度
     * @return 结果
     */
    public int insertSysTaskInfo(SysTaskInfo sysTaskInfo);

    /**
     * 修改任务进度
     * 
     * @param sysTaskInfo 任务进度
     * @return 结果
     */
    public int updateSysTaskInfo(SysTaskInfo sysTaskInfo);

    /**
     * 批量删除任务进度
     * 
     * @param taskIds 需要删除的任务进度主键集合
     * @return 结果
     */
    public int deleteSysTaskInfoByTaskIds(String[] taskIds);

    /**
     * 删除任务进度信息
     * 
     * @param taskId 任务进度主键
     * @return 结果
     */
    public int deleteSysTaskInfoByTaskId(String taskId);
}
