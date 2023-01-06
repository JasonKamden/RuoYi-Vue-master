package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysBillInfo;

/**
 * 票据详情Service接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface ISysBillInfoService 
{
    /**
     * 查询票据详情
     * 
     * @param billId 票据详情主键
     * @return 票据详情
     */
    public SysBillInfo selectSysBillInfoByBillId(String billId);

    /**
     * 查询票据详情列表
     * 
     * @param sysBillInfo 票据详情
     * @return 票据详情集合
     */
    public List<SysBillInfo> selectSysBillInfoList(SysBillInfo sysBillInfo);

    /**
     * 新增票据详情
     * 
     * @param sysBillInfo 票据详情
     * @return 结果
     */
    public int insertSysBillInfo(SysBillInfo sysBillInfo);

    /**
     * 修改票据详情
     * 
     * @param sysBillInfo 票据详情
     * @return 结果
     */
    public int updateSysBillInfo(SysBillInfo sysBillInfo);

    /**
     * 批量删除票据详情
     * 
     * @param billIds 需要删除的票据详情主键集合
     * @return 结果
     */
    public int deleteSysBillInfoByBillIds(String[] billIds);

    /**
     * 删除票据详情信息
     * 
     * @param billId 票据详情主键
     * @return 结果
     */
    public int deleteSysBillInfoByBillId(String billId);
}
