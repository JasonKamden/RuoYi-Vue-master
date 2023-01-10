package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysContractPayMapper;
import com.ruoyi.system.domain.SysContractPay;
import com.ruoyi.system.service.ISysContractPayService;

/**
 * 合同支付Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysContractPayServiceImpl implements ISysContractPayService 
{
    @Autowired
    private SysContractPayMapper sysContractPayMapper;

    /**
     * 查询合同支付
     * 
     * @param recordId 合同支付主键
     * @return 合同支付
     */
    @Override
    public SysContractPay selectSysContractPayByRecordId(String recordId)
    {
        return sysContractPayMapper.selectSysContractPayByRecordId(recordId);
    }

    /**
     * 查询合同支付列表
     * 
     * @param sysContractPay 合同支付
     * @return 合同支付
     */
    @Override
    public List<SysContractPay> selectSysContractPayList(SysContractPay sysContractPay)
    {
        return sysContractPayMapper.selectSysContractPayList(sysContractPay);
    }

    /**
     * 新增合同支付
     * 
     * @param sysContractPay 合同支付
     * @return 结果
     */
    @Override
    public int insertSysContractPay(SysContractPay sysContractPay)
    {
        sysContractPay.setCreateTime(DateUtils.getNowDate());
        sysContractPay.setRecordId(IdUtils.simpleUUID());
        return sysContractPayMapper.insertSysContractPay(sysContractPay);
    }

    /**
     * 修改合同支付
     * 
     * @param sysContractPay 合同支付
     * @return 结果
     */
    @Override
    public int updateSysContractPay(SysContractPay sysContractPay)
    {
        sysContractPay.setUpdateTime(DateUtils.getNowDate());
        return sysContractPayMapper.updateSysContractPay(sysContractPay);
    }

    /**
     * 批量删除合同支付
     * 
     * @param recordIds 需要删除的合同支付主键
     * @return 结果
     */
    @Override
    public int deleteSysContractPayByRecordIds(String[] recordIds)
    {
        return sysContractPayMapper.deleteSysContractPayByRecordIds(recordIds);
    }

    /**
     * 删除合同支付信息
     * 
     * @param recordId 合同支付主键
     * @return 结果
     */
    @Override
    public int deleteSysContractPayByRecordId(String recordId)
    {
        return sysContractPayMapper.deleteSysContractPayByRecordId(recordId);
    }
}
