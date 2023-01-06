package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysTaskInfoMapper;
import com.ruoyi.system.domain.SysTaskInfo;
import com.ruoyi.system.service.ISysTaskInfoService;

/**
 * 任务进度Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysTaskInfoServiceImpl implements ISysTaskInfoService 
{
    @Autowired
    private SysTaskInfoMapper sysTaskInfoMapper;

    /**
     * 查询任务进度
     * 
     * @param taskId 任务进度主键
     * @return 任务进度
     */
    @Override
    public SysTaskInfo selectSysTaskInfoByTaskId(String taskId)
    {
        return sysTaskInfoMapper.selectSysTaskInfoByTaskId(taskId);
    }

    /**
     * 查询任务进度列表
     * 
     * @param sysTaskInfo 任务进度
     * @return 任务进度
     */
    @Override
    public List<SysTaskInfo> selectSysTaskInfoList(SysTaskInfo sysTaskInfo)
    {
        return sysTaskInfoMapper.selectSysTaskInfoList(sysTaskInfo);
    }

    /**
     * 新增任务进度
     * 
     * @param sysTaskInfo 任务进度
     * @return 结果
     */
    @Override
    public int insertSysTaskInfo(SysTaskInfo sysTaskInfo)
    {
        return sysTaskInfoMapper.insertSysTaskInfo(sysTaskInfo);
    }

    /**
     * 修改任务进度
     * 
     * @param sysTaskInfo 任务进度
     * @return 结果
     */
    @Override
    public int updateSysTaskInfo(SysTaskInfo sysTaskInfo)
    {
        return sysTaskInfoMapper.updateSysTaskInfo(sysTaskInfo);
    }

    /**
     * 批量删除任务进度
     * 
     * @param taskIds 需要删除的任务进度主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskInfoByTaskIds(String[] taskIds)
    {
        return sysTaskInfoMapper.deleteSysTaskInfoByTaskIds(taskIds);
    }

    /**
     * 删除任务进度信息
     * 
     * @param taskId 任务进度主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskInfoByTaskId(String taskId)
    {
        return sysTaskInfoMapper.deleteSysTaskInfoByTaskId(taskId);
    }
}
