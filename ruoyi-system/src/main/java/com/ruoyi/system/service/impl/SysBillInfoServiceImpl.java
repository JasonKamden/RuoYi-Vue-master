package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysBillInfoMapper;
import com.ruoyi.system.domain.SysBillInfo;
import com.ruoyi.system.service.ISysBillInfoService;

/**
 * 票据详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysBillInfoServiceImpl implements ISysBillInfoService 
{
    @Autowired
    private SysBillInfoMapper sysBillInfoMapper;

    /**
     * 查询票据详情
     * 
     * @param billId 票据详情主键
     * @return 票据详情
     */
    @Override
    public SysBillInfo selectSysBillInfoByBillId(String billId)
    {
        return sysBillInfoMapper.selectSysBillInfoByBillId(billId);
    }

    /**
     * 查询票据详情列表
     * 
     * @param sysBillInfo 票据详情
     * @return 票据详情
     */
    @Override
    public List<SysBillInfo> selectSysBillInfoList(SysBillInfo sysBillInfo)
    {
        return sysBillInfoMapper.selectSysBillInfoList(sysBillInfo);
    }

    /**
     * 新增票据详情
     * 
     * @param sysBillInfo 票据详情
     * @return 结果
     */
    @Override
    public int insertSysBillInfo(SysBillInfo sysBillInfo)
    {
        sysBillInfo.setCreateTime(DateUtils.getNowDate());
        return sysBillInfoMapper.insertSysBillInfo(sysBillInfo);
    }

    /**
     * 修改票据详情
     * 
     * @param sysBillInfo 票据详情
     * @return 结果
     */
    @Override
    public int updateSysBillInfo(SysBillInfo sysBillInfo)
    {
        sysBillInfo.setUpdateTime(DateUtils.getNowDate());
        return sysBillInfoMapper.updateSysBillInfo(sysBillInfo);
    }

    /**
     * 批量删除票据详情
     * 
     * @param billIds 需要删除的票据详情主键
     * @return 结果
     */
    @Override
    public int deleteSysBillInfoByBillIds(String[] billIds)
    {
        return sysBillInfoMapper.deleteSysBillInfoByBillIds(billIds);
    }

    /**
     * 删除票据详情信息
     * 
     * @param billId 票据详情主键
     * @return 结果
     */
    @Override
    public int deleteSysBillInfoByBillId(String billId)
    {
        return sysBillInfoMapper.deleteSysBillInfoByBillId(billId);
    }
}
