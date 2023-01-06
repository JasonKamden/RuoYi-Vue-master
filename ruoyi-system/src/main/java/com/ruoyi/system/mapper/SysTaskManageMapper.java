package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysTaskManage;

/**
 * 任务Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface SysTaskManageMapper 
{
    /**
     * 查询任务
     * 
     * @param taskId 任务主键
     * @return 任务
     */
    public SysTaskManage selectSysTaskManageByTaskId(String taskId);

    /**
     * 查询任务列表
     * 
     * @param sysTaskManage 任务
     * @return 任务集合
     */
    public List<SysTaskManage> selectSysTaskManageList(SysTaskManage sysTaskManage);

    /**
     * 新增任务
     * 
     * @param sysTaskManage 任务
     * @return 结果
     */
    public int insertSysTaskManage(SysTaskManage sysTaskManage);

    /**
     * 修改任务
     * 
     * @param sysTaskManage 任务
     * @return 结果
     */
    public int updateSysTaskManage(SysTaskManage sysTaskManage);

    /**
     * 删除任务
     * 
     * @param taskId 任务主键
     * @return 结果
     */
    public int deleteSysTaskManageByTaskId(String taskId);

    /**
     * 批量删除任务
     * 
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysTaskManageByTaskIds(String[] taskIds);
}
