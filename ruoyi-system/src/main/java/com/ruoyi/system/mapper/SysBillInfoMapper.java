package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysBillInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 票据详情Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysBillInfoMapper 
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
     * 删除票据详情
     * 
     * @param billId 票据详情主键
     * @return 结果
     */
    public int deleteSysBillInfoByBillId(String billId);

    /**
     * 批量删除票据详情
     * 
     * @param billIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysBillInfoByBillIds(String[] billIds);
}
