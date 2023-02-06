package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysContractPay;
import org.apache.ibatis.annotations.Mapper;

/**
 * 合同支付Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysContractPayMapper 
{
    /**
     * 查询合同支付
     * 
     * @param recordId 合同支付主键
     * @return 合同支付
     */
    public SysContractPay selectSysContractPayByRecordId(String recordId);

    /**
     * 查询合同支付列表
     * 
     * @param sysContractPay 合同支付
     * @return 合同支付集合
     */
    public List<SysContractPay> selectSysContractPayList(SysContractPay sysContractPay);

    /**
     * 新增合同支付
     * 
     * @param sysContractPay 合同支付
     * @return 结果
     */
    public int insertSysContractPay(SysContractPay sysContractPay);

    /**
     * 修改合同支付
     * 
     * @param sysContractPay 合同支付
     * @return 结果
     */
    public int updateSysContractPay(SysContractPay sysContractPay);

    /**
     * 删除合同支付
     * 
     * @param recordId 合同支付主键
     * @return 结果
     */
    public int deleteSysContractPayByRecordId(String recordId);

    /**
     * 批量删除合同支付
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysContractPayByRecordIds(String[] recordIds);
}
