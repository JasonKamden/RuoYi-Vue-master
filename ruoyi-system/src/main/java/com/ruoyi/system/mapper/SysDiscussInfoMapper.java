package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysDiscussInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 讨论区Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@Mapper
public interface SysDiscussInfoMapper 
{
    /**
     * 查询讨论区
     * 
     * @param recordId 讨论区主键
     * @return 讨论区
     */
    public SysDiscussInfo selectSysDiscussInfoByRecordId(String recordId);

    /**
     * 查询讨论区列表
     * 
     * @param sysDiscussInfo 讨论区
     * @return 讨论区集合
     */
    public List<SysDiscussInfo> selectSysDiscussInfoList(SysDiscussInfo sysDiscussInfo);

    /**
     * 新增讨论区
     * 
     * @param sysDiscussInfo 讨论区
     * @return 结果
     */
    public int insertSysDiscussInfo(SysDiscussInfo sysDiscussInfo);

    /**
     * 修改讨论区
     * 
     * @param sysDiscussInfo 讨论区
     * @return 结果
     */
    public int updateSysDiscussInfo(SysDiscussInfo sysDiscussInfo);

    /**
     * 删除讨论区
     * 
     * @param recordId 讨论区主键
     * @return 结果
     */
    public int deleteSysDiscussInfoByRecordId(String recordId);

    /**
     * 批量删除讨论区
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysDiscussInfoByRecordIds(String[] recordIds);
}
