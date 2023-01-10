package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMeetingInfoMapper;
import com.ruoyi.system.domain.SysMeetingInfo;
import com.ruoyi.system.service.ISysMeetingInfoService;

/**
 * 会议信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
@Service
public class SysMeetingInfoServiceImpl implements ISysMeetingInfoService 
{
    @Autowired
    private SysMeetingInfoMapper sysMeetingInfoMapper;

    /**
     * 查询会议信息
     * 
     * @param roomId 会议信息主键
     * @return 会议信息
     */
    @Override
    public SysMeetingInfo selectSysMeetingInfoByRoomId(String roomId)
    {
        return sysMeetingInfoMapper.selectSysMeetingInfoByRoomId(roomId);
    }

    /**
     * 查询会议信息列表
     * 
     * @param sysMeetingInfo 会议信息
     * @return 会议信息
     */
    @Override
    public List<SysMeetingInfo> selectSysMeetingInfoList(SysMeetingInfo sysMeetingInfo)
    {
        return sysMeetingInfoMapper.selectSysMeetingInfoList(sysMeetingInfo);
    }

    /**
     * 新增会议信息
     * 
     * @param sysMeetingInfo 会议信息
     * @return 结果
     */
    @Override
    public int insertSysMeetingInfo(SysMeetingInfo sysMeetingInfo)
    {
        sysMeetingInfo.setCreateTime(DateUtils.getNowDate());
        sysMeetingInfo.setRoomId(IdUtils.simpleUUID());
        return sysMeetingInfoMapper.insertSysMeetingInfo(sysMeetingInfo);
    }

    /**
     * 修改会议信息
     * 
     * @param sysMeetingInfo 会议信息
     * @return 结果
     */
    @Override
    public int updateSysMeetingInfo(SysMeetingInfo sysMeetingInfo)
    {
        sysMeetingInfo.setUpdateTime(DateUtils.getNowDate());
        return sysMeetingInfoMapper.updateSysMeetingInfo(sysMeetingInfo);
    }

    /**
     * 批量删除会议信息
     * 
     * @param roomIds 需要删除的会议信息主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingInfoByRoomIds(String[] roomIds)
    {
        return sysMeetingInfoMapper.deleteSysMeetingInfoByRoomIds(roomIds);
    }

    /**
     * 删除会议信息信息
     * 
     * @param roomId 会议信息主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingInfoByRoomId(String roomId)
    {
        return sysMeetingInfoMapper.deleteSysMeetingInfoByRoomId(roomId);
    }
}
