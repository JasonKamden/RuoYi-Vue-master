package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSupplies;

/**
 * 物资Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface SysSuppliesMapper 
{
    /**
     * 查询物资
     * 
     * @param sortId 物资主键
     * @return 物资
     */
    public SysSupplies selectSysSuppliesBySortId(Long sortId);

    /**
     * 查询物资列表
     * 
     * @param sysSupplies 物资
     * @return 物资集合
     */
    public List<SysSupplies> selectSysSuppliesList(SysSupplies sysSupplies);

    /**
     * 新增物资
     * 
     * @param sysSupplies 物资
     * @return 结果
     */
    public int insertSysSupplies(SysSupplies sysSupplies);

    /**
     * 修改物资
     * 
     * @param sysSupplies 物资
     * @return 结果
     */
    public int updateSysSupplies(SysSupplies sysSupplies);

    /**
     * 删除物资
     * 
     * @param sortId 物资主键
     * @return 结果
     */
    public int deleteSysSuppliesBySortId(Long sortId);

    /**
     * 批量删除物资
     * 
     * @param sortIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSuppliesBySortIds(Long[] sortIds);
}
