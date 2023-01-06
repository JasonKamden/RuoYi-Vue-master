package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSalaryInfo;

/**
 * 工资详情Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface SysSalaryInfoMapper 
{
    /**
     * 查询工资详情
     * 
     * @param id 工资详情主键
     * @return 工资详情
     */
    public SysSalaryInfo selectSysSalaryInfoById(Long id);

    /**
     * 查询工资详情列表
     * 
     * @param sysSalaryInfo 工资详情
     * @return 工资详情集合
     */
    public List<SysSalaryInfo> selectSysSalaryInfoList(SysSalaryInfo sysSalaryInfo);

    /**
     * 新增工资详情
     * 
     * @param sysSalaryInfo 工资详情
     * @return 结果
     */
    public int insertSysSalaryInfo(SysSalaryInfo sysSalaryInfo);

    /**
     * 修改工资详情
     * 
     * @param sysSalaryInfo 工资详情
     * @return 结果
     */
    public int updateSysSalaryInfo(SysSalaryInfo sysSalaryInfo);

    /**
     * 删除工资详情
     * 
     * @param id 工资详情主键
     * @return 结果
     */
    public int deleteSysSalaryInfoById(Long id);

    /**
     * 批量删除工资详情
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSalaryInfoByIds(Long[] ids);
}
