package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysContractInfo;

/**
 * 合同详情Service接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface ISysContractInfoService 
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
     * 批量删除合同详情
     * 
     * @param infoIds 需要删除的合同详情主键集合
     * @return 结果
     */
    public int deleteSysContractInfoByInfoIds(String[] infoIds);

    /**
     * 删除合同详情信息
     * 
     * @param infoId 合同详情主键
     * @return 结果
     */
    public int deleteSysContractInfoByInfoId(String infoId);
}
