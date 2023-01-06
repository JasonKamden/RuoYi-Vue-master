package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysContract;

/**
 * 合同Service接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface ISysContractService 
{
    /**
     * 查询合同
     * 
     * @param contractId 合同主键
     * @return 合同
     */
    public SysContract selectSysContractByContractId(String contractId);

    /**
     * 查询合同列表
     * 
     * @param sysContract 合同
     * @return 合同集合
     */
    public List<SysContract> selectSysContractList(SysContract sysContract);

    /**
     * 新增合同
     * 
     * @param sysContract 合同
     * @return 结果
     */
    public int insertSysContract(SysContract sysContract);

    /**
     * 修改合同
     * 
     * @param sysContract 合同
     * @return 结果
     */
    public int updateSysContract(SysContract sysContract);

    /**
     * 批量删除合同
     * 
     * @param contractIds 需要删除的合同主键集合
     * @return 结果
     */
    public int deleteSysContractByContractIds(String[] contractIds);

    /**
     * 删除合同信息
     * 
     * @param contractId 合同主键
     * @return 结果
     */
    public int deleteSysContractByContractId(String contractId);
}
