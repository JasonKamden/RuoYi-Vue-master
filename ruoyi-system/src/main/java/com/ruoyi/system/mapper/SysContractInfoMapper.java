package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysContractInfo;
import com.ruoyi.system.domain.SysContract;
import org.apache.ibatis.annotations.Mapper;

/**
 * 合同详情Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysContractInfoMapper 
{
    /**
     * 查询合同详情
     * 
     * @param infoId 合同详情主键
     * @return 合同详情
     */
    public SysContractInfo selectSysContractInfoByInfoId(String infoId);

    /**
     * 查询合同详情列表
     * 
     * @param sysContractInfo 合同详情
     * @return 合同详情集合
     */
    public List<SysContractInfo> selectSysContractInfoList(SysContractInfo sysContractInfo);

    /**
     * 新增合同详情
     * 
     * @param sysContractInfo 合同详情
     * @return 结果
     */
    public int insertSysContractInfo(SysContractInfo sysContractInfo);

    /**
     * 修改合同详情
     * 
     * @param sysContractInfo 合同详情
     * @return 结果
     */
    public int updateSysContractInfo(SysContractInfo sysContractInfo);

    /**
     * 删除合同详情
     * 
     * @param infoId 合同详情主键
     * @return 结果
     */
    public int deleteSysContractInfoByInfoId(String infoId);

    /**
     * 批量删除合同详情
     * 
     * @param infoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysContractInfoByInfoIds(String[] infoIds);

    /**
     * 批量删除合同
     * 
     * @param infoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysContractByContractIds(String[] infoIds);
    
    /**
     * 批量新增合同
     * 
     * @param sysContractList 合同列表
     * @return 结果
     */
    public int batchSysContract(List<SysContract> sysContractList);
    

    /**
     * 通过合同详情主键删除合同信息
     * 
     * @param infoId 合同详情ID
     * @return 结果
     */
    public int deleteSysContractByContractId(String infoId);
}
