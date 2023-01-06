package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysBigstoryInfoMapper;
import com.ruoyi.system.domain.SysBigstoryInfo;
import com.ruoyi.system.service.ISysBigstoryInfoService;

/**
 * 大事记管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@Service
public class SysBigstoryInfoServiceImpl implements ISysBigstoryInfoService 
{
    @Autowired
    private SysBigstoryInfoMapper sysBigstoryInfoMapper;

    /**
     * 查询大事记管理
     * 
     * @param attachId 大事记管理主键
     * @return 大事记管理
     */
    @Override
    public SysBigstoryInfo selectSysBigstoryInfoByAttachId(String attachId)
    {
        return sysBigstoryInfoMapper.selectSysBigstoryInfoByAttachId(attachId);
    }

    /**
     * 查询大事记管理列表
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 大事记管理
     */
    @Override
    public List<SysBigstoryInfo> selectSysBigstoryInfoList(SysBigstoryInfo sysBigstoryInfo)
    {
        return sysBigstoryInfoMapper.selectSysBigstoryInfoList(sysBigstoryInfo);
    }

    /**
     * 新增大事记管理
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 结果
     */
    @Override
    public int insertSysBigstoryInfo(SysBigstoryInfo sysBigstoryInfo)
    {
        sysBigstoryInfo.setCreateTime(DateUtils.getNowDate());
        return sysBigstoryInfoMapper.insertSysBigstoryInfo(sysBigstoryInfo);
    }

    /**
     * 修改大事记管理
     * 
     * @param sysBigstoryInfo 大事记管理
     * @return 结果
     */
    @Override
    public int updateSysBigstoryInfo(SysBigstoryInfo sysBigstoryInfo)
    {
        sysBigstoryInfo.setUpdateTime(DateUtils.getNowDate());
        return sysBigstoryInfoMapper.updateSysBigstoryInfo(sysBigstoryInfo);
    }

    /**
     * 批量删除大事记管理
     * 
     * @param attachIds 需要删除的大事记管理主键
     * @return 结果
     */
    @Override
    public int deleteSysBigstoryInfoByAttachIds(String[] attachIds)
    {
        return sysBigstoryInfoMapper.deleteSysBigstoryInfoByAttachIds(attachIds);
    }

    /**
     * 删除大事记管理信息
     * 
     * @param attachId 大事记管理主键
     * @return 结果
     */
    @Override
    public int deleteSysBigstoryInfoByAttachId(String attachId)
    {
        return sysBigstoryInfoMapper.deleteSysBigstoryInfoByAttachId(attachId);
    }
}
