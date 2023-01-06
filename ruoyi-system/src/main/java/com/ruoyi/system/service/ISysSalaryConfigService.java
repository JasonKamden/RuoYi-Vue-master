package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysSalaryConfig;

/**
 * 工资配置Service接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface ISysSalaryConfigService 
{
    /**
     * 查询工资配置
     * 
     * @param id 工资配置主键
     * @return 工资配置
     */
    public SysSalaryConfig selectSysSalaryConfigById(Long id);

    /**
     * 查询工资配置列表
     * 
     * @param sysSalaryConfig 工资配置
     * @return 工资配置集合
     */
    public List<SysSalaryConfig> selectSysSalaryConfigList(SysSalaryConfig sysSalaryConfig);

    /**
     * 新增工资配置
     * 
     * @param sysSalaryConfig 工资配置
     * @return 结果
     */
    public int insertSysSalaryConfig(SysSalaryConfig sysSalaryConfig);

    /**
     * 修改工资配置
     * 
     * @param sysSalaryConfig 工资配置
     * @return 结果
     */
    public int updateSysSalaryConfig(SysSalaryConfig sysSalaryConfig);

    /**
     * 批量删除工资配置
     * 
     * @param ids 需要删除的工资配置主键集合
     * @return 结果
     */
    public int deleteSysSalaryConfigByIds(Long[] ids);

    /**
     * 删除工资配置信息
     * 
     * @param id 工资配置主键
     * @return 结果
     */
    public int deleteSysSalaryConfigById(Long id);
}
