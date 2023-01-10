package com.ruoyi.system.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSalaryConfigMapper;
import com.ruoyi.system.domain.SysSalaryConfig;
import com.ruoyi.system.service.ISysSalaryConfigService;

/**
 * 工资配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Service
public class SysSalaryConfigServiceImpl implements ISysSalaryConfigService 
{
    @Autowired
    private SysSalaryConfigMapper sysSalaryConfigMapper;

    /**
     * 查询工资配置
     * 
     * @param id 工资配置主键
     * @return 工资配置
     */
    @Override
    public SysSalaryConfig selectSysSalaryConfigById(Long id)
    {
        return sysSalaryConfigMapper.selectSysSalaryConfigById(id);
    }

    /**
     * 查询工资配置列表
     * 
     * @param sysSalaryConfig 工资配置
     * @return 工资配置
     */
    @Override
    public List<SysSalaryConfig> selectSysSalaryConfigList(SysSalaryConfig sysSalaryConfig)
    {
        return sysSalaryConfigMapper.selectSysSalaryConfigList(sysSalaryConfig);
    }

    /**
     * 新增工资配置
     * 
     * @param sysSalaryConfig 工资配置
     * @return 结果
     */
    @Override
    public int insertSysSalaryConfig(SysSalaryConfig sysSalaryConfig)
    {
        sysSalaryConfig.setCreateTime(DateUtils.getNowDate());
        sysSalaryConfig.setId(IdWorker.getId());
        return sysSalaryConfigMapper.insertSysSalaryConfig(sysSalaryConfig);
    }

    /**
     * 修改工资配置
     * 
     * @param sysSalaryConfig 工资配置
     * @return 结果
     */
    @Override
    public int updateSysSalaryConfig(SysSalaryConfig sysSalaryConfig)
    {
        sysSalaryConfig.setUpdateTime(DateUtils.getNowDate());
        return sysSalaryConfigMapper.updateSysSalaryConfig(sysSalaryConfig);
    }

    /**
     * 批量删除工资配置
     * 
     * @param ids 需要删除的工资配置主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryConfigByIds(Long[] ids)
    {
        return sysSalaryConfigMapper.deleteSysSalaryConfigByIds(ids);
    }

    /**
     * 删除工资配置信息
     * 
     * @param id 工资配置主键
     * @return 结果
     */
    @Override
    public int deleteSysSalaryConfigById(Long id)
    {
        return sysSalaryConfigMapper.deleteSysSalaryConfigById(id);
    }
}
