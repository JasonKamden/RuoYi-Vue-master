package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSuppliesApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物资申请Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysSuppliesApplyMapper 
{
    /**
     * 查询物资申请
     * 
     * @param suppliesId 物资申请主键
     * @return 物资申请
     */
    public SysSuppliesApply selectSysSuppliesApplyBySuppliesId(Long suppliesId);

    /**
     * 查询物资申请列表
     * 
     * @param sysSuppliesApply 物资申请
     * @return 物资申请集合
     */
    public List<SysSuppliesApply> selectSysSuppliesApplyList(SysSuppliesApply sysSuppliesApply);

    /**
     * 新增物资申请
     * 
     * @param sysSuppliesApply 物资申请
     * @return 结果
     */
    public int insertSysSuppliesApply(SysSuppliesApply sysSuppliesApply);

    /**
     * 修改物资申请
     * 
     * @param sysSuppliesApply 物资申请
     * @return 结果
     */
    public int updateSysSuppliesApply(SysSuppliesApply sysSuppliesApply);

    /**
     * 删除物资申请
     * 
     * @param suppliesId 物资申请主键
     * @return 结果
     */
    public int deleteSysSuppliesApplyBySuppliesId(Long suppliesId);

    /**
     * 批量删除物资申请
     * 
     * @param suppliesIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSuppliesApplyBySuppliesIds(Long[] suppliesIds);
}
