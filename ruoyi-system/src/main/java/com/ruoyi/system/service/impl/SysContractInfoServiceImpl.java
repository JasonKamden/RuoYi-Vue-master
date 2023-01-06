package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.system.domain.SysContract;
import com.ruoyi.system.mapper.SysContractInfoMapper;
import com.ruoyi.system.domain.SysContractInfo;
import com.ruoyi.system.service.ISysContractInfoService;

/**
 * 合同详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysContractInfoServiceImpl implements ISysContractInfoService 
{
    @Autowired
    private SysContractInfoMapper sysContractInfoMapper;

    /**
     * 查询合同详情
     * 
     * @param infoId 合同详情主键
     * @return 合同详情
     */
    @Override
    public SysContractInfo selectSysContractInfoByInfoId(String infoId)
    {
        return sysContractInfoMapper.selectSysContractInfoByInfoId(infoId);
    }

    /**
     * 查询合同详情列表
     * 
     * @param sysContractInfo 合同详情
     * @return 合同详情
     */
    @Override
    public List<SysContractInfo> selectSysContractInfoList(SysContractInfo sysContractInfo)
    {
        return sysContractInfoMapper.selectSysContractInfoList(sysContractInfo);
    }

    /**
     * 新增合同详情
     * 
     * @param sysContractInfo 合同详情
     * @return 结果
     */
    @Transactional
    @Override
    public int insertSysContractInfo(SysContractInfo sysContractInfo)
    {
        sysContractInfo.setCreateTime(DateUtils.getNowDate());
        int rows = sysContractInfoMapper.insertSysContractInfo(sysContractInfo);
        insertSysContract(sysContractInfo);
        return rows;
    }

    /**
     * 修改合同详情
     * 
     * @param sysContractInfo 合同详情
     * @return 结果
     */
    @Transactional
    @Override
    public int updateSysContractInfo(SysContractInfo sysContractInfo)
    {
        sysContractInfo.setUpdateTime(DateUtils.getNowDate());
        sysContractInfoMapper.deleteSysContractByContractId(sysContractInfo.getInfoId());
        insertSysContract(sysContractInfo);
        return sysContractInfoMapper.updateSysContractInfo(sysContractInfo);
    }

    /**
     * 批量删除合同详情
     * 
     * @param infoIds 需要删除的合同详情主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysContractInfoByInfoIds(String[] infoIds)
    {
        sysContractInfoMapper.deleteSysContractByContractIds(infoIds);
        return sysContractInfoMapper.deleteSysContractInfoByInfoIds(infoIds);
    }

    /**
     * 删除合同详情信息
     * 
     * @param infoId 合同详情主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysContractInfoByInfoId(String infoId)
    {
        sysContractInfoMapper.deleteSysContractByContractId(infoId);
        return sysContractInfoMapper.deleteSysContractInfoByInfoId(infoId);
    }

    /**
     * 新增合同信息
     * 
     * @param sysContractInfo 合同详情对象
     */
    public void insertSysContract(SysContractInfo sysContractInfo)
    {
        List<SysContract> sysContractList = sysContractInfo.getSysContractList();
        String infoId = sysContractInfo.getInfoId();
        if (StringUtils.isNotNull(sysContractList))
        {
            List<SysContract> list = new ArrayList<SysContract>();
            for (SysContract sysContract : sysContractList)
            {
                sysContract.setContractId(infoId);
                list.add(sysContract);
            }
            if (list.size() > 0)
            {
                sysContractInfoMapper.batchSysContract(list);
            }
        }
    }
}
