package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSalaryInfoMapper;
import com.ruoyi.system.domain.SysSalaryInfo;
import com.ruoyi.system.service.ISysSalaryInfoService;

/**
 * 工资详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysSalaryInfoServiceImpl implements ISysSalaryInfoService 
{
    @Autowired
    private SysSalaryInfoMapper sysSalaryInfoMapper;

    /**
     * 查询工资详情
     * 
     * @param id 工资详情主键
     * @return 工资详情
     */
    @Override
    public SysSalaryInfo selectSysSalaryInfoById(Long id)
    {
        return sysSalaryInfoMapper.selectSysSalaryInfoById(id);
    }

    /**
     * 查询工资详情列表
     * 
     * @param sysSalaryInfo 工资详情
     * @return 工资详情
     */
    @Override
    public List<SysSalaryInfo> selectSysSalaryInfoList(SysSalaryInfo sysSalaryInfo)
    {
        return sysSalaryInfoMapper.selectSysSalaryInfoList(sysSalaryInfo);
    }

    /**
     * 新增工资详情
     * 
     * @param sysSalaryInfo 工资详情
     * @return 结果
     */
    @Override
    public int insertSysSalaryInfo(SysSalaryInfo sysSalaryInfo)
    {
        sysSalaryInfo.setCreateTime(DateUtils.getNowDate());
        return sysSalaryInfoMapper.insertSysSalaryInfo(sysSalaryInfo);
    }

    /**
     * 修改工资详情
     * 
     * @param sysSalaryInfo 工资详情
     * @return 结果
     */
    @Override
    public int updateSysSalaryInfo(SysSalaryInfo sysSalaryInfo)
    {
        sysSalaryInfo.setUpdateTime(DateUtils.getNowDate());
        return sysSalaryInfoMapper.updateSysSalaryInfo(sysSalaryInfo);
    }

    /**
     * 批量删除工资详情
     * 
     * @param ids 需要删除的工资详情主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryInfoByIds(Long[] ids)
    {
        return sysSalaryInfoMapper.deleteSysSalaryInfoByIds(ids);
    }

    /**
     * 删除工资详情信息
     * 
     * @param id 工资详情主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryInfoById(Long id)
    {
        return sysSalaryInfoMapper.deleteSysSalaryInfoById(id);
    }
}
