package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysFileInfo;

/**
 * 文件管理Service接口
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public interface ISysFileInfoService 
{
    /**
     * 查询文件管理
     * 
     * @param fileId 文件管理主键
     * @return 文件管理
     */
    public SysFileInfo selectSysFileInfoByFileId(String fileId);

    /**
     * 查询文件管理列表
     * 
     * @param sysFileInfo 文件管理
     * @return 文件管理集合
     */
    public List<SysFileInfo> selectSysFileInfoList(SysFileInfo sysFileInfo);

    /**
     * 新增文件管理
     * 
     * @param sysFileInfo 文件管理
     * @return 结果
     */
    public int insertSysFileInfo(SysFileInfo sysFileInfo);

    /**
     * 修改文件管理
     * 
     * @param sysFileInfo 文件管理
     * @return 结果
     */
    public int updateSysFileInfo(SysFileInfo sysFileInfo);

    /**
     * 批量删除文件管理
     * 
     * @param fileIds 需要删除的文件管理主键集合
     * @return 结果
     */
    public int deleteSysFileInfoByFileIds(String[] fileIds);

    /**
     * 删除文件管理信息
     * 
     * @param fileId 文件管理主键
     * @return 结果
     */
    public int deleteSysFileInfoByFileId(String fileId);
}
