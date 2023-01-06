package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSuppliesMapper;
import com.ruoyi.system.domain.SysSupplies;
import com.ruoyi.system.service.ISysSuppliesService;

/**
 * 物资Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysSuppliesServiceImpl implements ISysSuppliesService 
{
    @Autowired
    private SysSuppliesMapper sysSuppliesMapper;

    /**
     * 查询物资
     * 
     * @param sortId 物资主键
     * @return 物资
     */
    @Override
    public SysSupplies selectSysSuppliesBySortId(Long sortId)
    {
        return sysSuppliesMapper.selectSysSuppliesBySortId(sortId);
    }

    /**
     * 查询物资列表
     * 
     * @param sysSupplies 物资
     * @return 物资
     */
    @Override
    public List<SysSupplies> selectSysSuppliesList(SysSupplies sysSupplies)
    {
        return sysSuppliesMapper.selectSysSuppliesList(sysSupplies);
    }

    /**
     * 新增物资
     * 
     * @param sysSupplies 物资
     * @return 结果
     */
    @Override
    public int insertSysSupplies(SysSupplies sysSupplies)
    {
        sysSupplies.setCreateTime(DateUtils.getNowDate());
        return sysSuppliesMapper.insertSysSupplies(sysSupplies);
    }

    /**
     * 修改物资
     * 
     * @param sysSupplies 物资
     * @return 结果
     */
    @Override
    public int updateSysSupplies(SysSupplies sysSupplies)
    {
        sysSupplies.setUpdateTime(DateUtils.getNowDate());
        return sysSuppliesMapper.updateSysSupplies(sysSupplies);
    }

    /**
     * 批量删除物资
     * 
     * @param sortIds 需要删除的物资主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesBySortIds(Long[] sortIds)
    {
        return sysSuppliesMapper.deleteSysSuppliesBySortIds(sortIds);
    }

    /**
     * 删除物资信息
     * 
     * @param sortId 物资主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesBySortId(Long sortId)
    {
        return sysSuppliesMapper.deleteSysSuppliesBySortId(sortId);
    }
}
