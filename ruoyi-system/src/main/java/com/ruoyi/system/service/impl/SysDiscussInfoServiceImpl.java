package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysDiscussInfoMapper;
import com.ruoyi.system.domain.SysDiscussInfo;
import com.ruoyi.system.service.ISysDiscussInfoService;

/**
 * 讨论区Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysDiscussInfoServiceImpl implements ISysDiscussInfoService 
{
    @Autowired
    private SysDiscussInfoMapper sysDiscussInfoMapper;

    /**
     * 查询讨论区
     * 
     * @param recordId 讨论区主键
     * @return 讨论区
     */
    @Override
    public SysDiscussInfo selectSysDiscussInfoByRecordId(String recordId)
    {
        return sysDiscussInfoMapper.selectSysDiscussInfoByRecordId(recordId);
    }

    /**
     * 查询讨论区列表
     * 
     * @param sysDiscussInfo 讨论区
     * @return 讨论区
     */
    @Override
    public List<SysDiscussInfo> selectSysDiscussInfoList(SysDiscussInfo sysDiscussInfo)
    {
        return sysDiscussInfoMapper.selectSysDiscussInfoList(sysDiscussInfo);
    }

    /**
     * 新增讨论区
     * 
     * @param sysDiscussInfo 讨论区
     * @return 结果
     */
    @Override
    public int insertSysDiscussInfo(SysDiscussInfo sysDiscussInfo)
    {
        sysDiscussInfo.setCreateTime(DateUtils.getNowDate());
        return sysDiscussInfoMapper.insertSysDiscussInfo(sysDiscussInfo);
    }

    /**
     * 修改讨论区
     * 
     * @param sysDiscussInfo 讨论区
     * @return 结果
     */
    @Override
    public int updateSysDiscussInfo(SysDiscussInfo sysDiscussInfo)
    {
        sysDiscussInfo.setUpdateTime(DateUtils.getNowDate());
        return sysDiscussInfoMapper.updateSysDiscussInfo(sysDiscussInfo);
    }

    /**
     * 批量删除讨论区
     * 
     * @param recordIds 需要删除的讨论区主键
     * @return 结果
     */
    @Override
    public int deleteSysDiscussInfoByRecordIds(String[] recordIds)
    {
        return sysDiscussInfoMapper.deleteSysDiscussInfoByRecordIds(recordIds);
    }

    /**
     * 删除讨论区信息
     * 
     * @param recordId 讨论区主键
     * @return 结果
     */
    @Override
    public int deleteSysDiscussInfoByRecordId(String recordId)
    {
        return sysDiscussInfoMapper.deleteSysDiscussInfoByRecordId(recordId);
    }
}
