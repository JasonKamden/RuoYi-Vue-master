package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysBigstoryInfo;

/**
 * 大事记管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public interface SysBigstoryInfoMapper 
{
    /**
     * 查询大事记管理
     * 
     * @param attachId 大事记管理主键
     * @return 大事记管理
     */
    public SysBigstoryInfo selectSysBigstoryInfoByAttachId(String attachId);

    /**
     * 查询大事记管理列表
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 大事记管理集合
     */
    public List<SysBigstoryInfo> selectSysBigstoryInfoList(SysBigstoryInfo sysBigstoryInfo);

    /**
     * 新增大事记管理
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 结果
     */
    public int insertSysBigstoryInfo(SysBigstoryInfo sysBigstoryInfo);

    /**
     * 修改大事记管理
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 结果
     */
    public int updateSysBigstoryInfo(SysBigstoryInfo sysBigstoryInfo);

    /**
     * 删除大事记管理
     * 
     * @param attachId 大事记管理主键
     * @return 结果
     */
    public int deleteSysBigstoryInfoByAttachId(String attachId);

    /**
     * 批量删除大事记管理
     * 
     * @param attachIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysBigstoryInfoByAttachIds(String[] attachIds);
}
