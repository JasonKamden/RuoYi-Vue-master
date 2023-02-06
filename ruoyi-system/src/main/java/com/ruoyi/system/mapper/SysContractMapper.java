package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysContract;
import org.apache.ibatis.annotations.Mapper;

/**
 * 合同Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysContractMapper 
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
     * 删除合同
     * 
     * @param contractId 合同主键
     * @return 结果
     */
    public int deleteSysContractByContractId(String contractId);

    /**
     * 批量删除合同
     * 
     * @param contractIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysContractByContractIds(String[] contractIds);
}
