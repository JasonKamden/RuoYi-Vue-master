package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSuppliesDetailMapper;
import com.ruoyi.system.domain.SysSuppliesDetail;
import com.ruoyi.system.service.ISysSuppliesDetailService;

/**
 * 物资详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysSuppliesDetailServiceImpl implements ISysSuppliesDetailService 
{
    @Autowired
    private SysSuppliesDetailMapper sysSuppliesDetailMapper;

    /**
     * 查询物资详情
     * 
     * @param suppliesId 物资详情主键
     * @return 物资详情
     */
    @Override
    public SysSuppliesDetail selectSysSuppliesDetailBySuppliesId(Long suppliesId)
    {
        return sysSuppliesDetailMapper.selectSysSuppliesDetailBySuppliesId(suppliesId);
    }

    /**
     * 查询物资详情列表
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 物资详情
     */
    @Override
    public List<SysSuppliesDetail> selectSysSuppliesDetailList(SysSuppliesDetail sysSuppliesDetail)
    {
        return sysSuppliesDetailMapper.selectSysSuppliesDetailList(sysSuppliesDetail);
    }

    /**
     * 新增物资详情
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 结果
     */
    @Override
    public int insertSysSuppliesDetail(SysSuppliesDetail sysSuppliesDetail)
    {
        sysSuppliesDetail.setCreateTime(DateUtils.getNowDate());
        return sysSuppliesDetailMapper.insertSysSuppliesDetail(sysSuppliesDetail);
    }

    /**
     * 修改物资详情
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 结果
     */
    @Override
    public int updateSysSuppliesDetail(SysSuppliesDetail sysSuppliesDetail)
    {
        sysSuppliesDetail.setUpdateTime(DateUtils.getNowDate());
        return sysSuppliesDetailMapper.updateSysSuppliesDetail(sysSuppliesDetail);
    }

    /**
     * 批量删除物资详情
     * 
     * @param suppliesIds 需要删除的物资详情主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesDetailBySuppliesIds(Long[] suppliesIds)
    {
        return sysSuppliesDetailMapper.deleteSysSuppliesDetailBySuppliesIds(suppliesIds);
    }

    /**
     * 删除物资详情信息
     * 
     * @param suppliesId 物资详情主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesDetailBySuppliesId(Long suppliesId)
    {
        return sysSuppliesDetailMapper.deleteSysSuppliesDetailBySuppliesId(suppliesId);
    }
}
