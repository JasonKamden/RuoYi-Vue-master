package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysTaskManageMapper;
import com.ruoyi.system.domain.SysTaskManage;
import com.ruoyi.system.service.ISysTaskManageService;

/**
 * 任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysTaskManageServiceImpl implements ISysTaskManageService 
{
    @Autowired
    private SysTaskManageMapper sysTaskManageMapper;

    /**
     * 查询任务
     * 
     * @param taskId 任务主键
     * @return 任务
     */
    @Override
    public SysTaskManage selectSysTaskManageByTaskId(String taskId)
    {
        return sysTaskManageMapper.selectSysTaskManageByTaskId(taskId);
    }

    /**
     * 查询任务列表
     * 
     * @param sysTaskManage 任务
     * @return 任务
     */
    @Override
    public List<SysTaskManage> selectSysTaskManageList(SysTaskManage sysTaskManage)
    {
        return sysTaskManageMapper.selectSysTaskManageList(sysTaskManage);
    }

    /**
     * 新增任务
     * 
     * @param sysTaskManage 任务
     * @return 结果
     */
    @Override
    public int insertSysTaskManage(SysTaskManage sysTaskManage)
    {
        sysTaskManage.setCreateTime(DateUtils.getNowDate());
        sysTaskManage.setTaskId(IdUtils.simpleUUID());
        return sysTaskManageMapper.insertSysTaskManage(sysTaskManage);
    }

    /**
     * 修改任务
     * 
     * @param sysTaskManage 任务
     * @return 结果
     */
    @Override
    public int updateSysTaskManage(SysTaskManage sysTaskManage)
    {
        sysTaskManage.setUpdateTime(DateUtils.getNowDate());
        return sysTaskManageMapper.updateSysTaskManage(sysTaskManage);
    }

    /**
     * 批量删除任务
     * 
     * @param taskIds 需要删除的任务主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskManageByTaskIds(String[] taskIds)
    {
        return sysTaskManageMapper.deleteSysTaskManageByTaskIds(taskIds);
    }

    /**
     * 删除任务信息
     * 
     * @param taskId 任务主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskManageByTaskId(String taskId)
    {
        return sysTaskManageMapper.deleteSysTaskManageByTaskId(taskId);
    }
}
