package com.ruoyi.system.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSuppliesApplyMapper;
import com.ruoyi.system.domain.SysSuppliesApply;
import com.ruoyi.system.service.ISysSuppliesApplyService;

/**
 * 物资申请Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysSuppliesApplyServiceImpl implements ISysSuppliesApplyService 
{
    @Autowired
    private SysSuppliesApplyMapper sysSuppliesApplyMapper;

    /**
     * 查询物资申请
     * 
     * @param suppliesId 物资申请主键
     * @return 物资申请
     */
    @Override
    public SysSuppliesApply selectSysSuppliesApplyBySuppliesId(Long suppliesId)
    {
        return sysSuppliesApplyMapper.selectSysSuppliesApplyBySuppliesId(suppliesId);
    }

    /**
     * 查询物资申请列表
     * 
     * @param sysSuppliesApply 物资申请
     * @return 物资申请
     */
    @Override
    public List<SysSuppliesApply> selectSysSuppliesApplyList(SysSuppliesApply sysSuppliesApply)
    {
        return sysSuppliesApplyMapper.selectSysSuppliesApplyList(sysSuppliesApply);
    }

    /**
     * 新增物资申请
     * 
     * @param sysSuppliesApply 物资申请
     * @return 结果
     */
    @Override
    public int insertSysSuppliesApply(SysSuppliesApply sysSuppliesApply)
    {
        sysSuppliesApply.setCreateTime(DateUtils.getNowDate());
        sysSuppliesApply.setSuppliesId(IdWorker.getId());
        return sysSuppliesApplyMapper.insertSysSuppliesApply(sysSuppliesApply);
    }

    /**
     * 修改物资申请
     * 
     * @param sysSuppliesApply 物资申请
     * @return 结果
     */
    @Override
    public int updateSysSuppliesApply(SysSuppliesApply sysSuppliesApply)
    {
        sysSuppliesApply.setUpdateTime(DateUtils.getNowDate());
        return sysSuppliesApplyMapper.updateSysSuppliesApply(sysSuppliesApply);
    }

    /**
     * 批量删除物资申请
     * 
     * @param suppliesIds 需要删除的物资申请主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesApplyBySuppliesIds(Long[] suppliesIds)
    {
        return sysSuppliesApplyMapper.deleteSysSuppliesApplyBySuppliesIds(suppliesIds);
    }

    /**
     * 删除物资申请信息
     * 
     * @param suppliesId 物资申请主键
     * @return 结果
     */
    @Override
    public int deleteSysSuppliesApplyBySuppliesId(Long suppliesId)
    {
        return sysSuppliesApplyMapper.deleteSysSuppliesApplyBySuppliesId(suppliesId);
    }
}
