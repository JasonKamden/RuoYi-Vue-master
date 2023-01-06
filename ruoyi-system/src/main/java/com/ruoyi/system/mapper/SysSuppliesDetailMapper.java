package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSuppliesDetail;

/**
 * 物资详情Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public interface SysSuppliesDetailMapper 
{
    /**
     * 查询物资详情
     * 
     * @param suppliesId 物资详情主键
     * @return 物资详情
     */
    public SysSuppliesDetail selectSysSuppliesDetailBySuppliesId(Long suppliesId);

    /**
     * 查询物资详情列表
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 物资详情集合
     */
    public List<SysSuppliesDetail> selectSysSuppliesDetailList(SysSuppliesDetail sysSuppliesDetail);

    /**
     * 新增物资详情
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 结果
     */
    public int insertSysSuppliesDetail(SysSuppliesDetail sysSuppliesDetail);

    /**
     * 修改物资详情
     * 
     * @param sysSuppliesDetail 物资详情
     * @return 结果
     */
    public int updateSysSuppliesDetail(SysSuppliesDetail sysSuppliesDetail);

    /**
     * 删除物资详情
     * 
     * @param suppliesId 物资详情主键
     * @return 结果
     */
    public int deleteSysSuppliesDetailBySuppliesId(Long suppliesId);

    /**
     * 批量删除物资详情
     * 
     * @param suppliesIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSuppliesDetailBySuppliesIds(Long[] suppliesIds);
}
