package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMeetingUserMapper;
import com.ruoyi.system.domain.SysMeetingUser;
import com.ruoyi.system.service.ISysMeetingUserService;

/**
 * 用户会议Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@Service
public class SysMeetingUserServiceImpl implements ISysMeetingUserService 
{
    @Autowired
    private SysMeetingUserMapper sysMeetingUserMapper;

    /**
     * 查询用户会议
     * 
     * @param meetingId 用户会议主键
     * @return 用户会议
     */
    @Override
    public SysMeetingUser selectSysMeetingUserByMeetingId(String meetingId)
    {
        return sysMeetingUserMapper.selectSysMeetingUserByMeetingId(meetingId);
    }

    /**
     * 查询用户会议列表
     * 
     * @param sysMeetingUser 用户会议
     * @return 用户会议
     */
    @Override
    public List<SysMeetingUser> selectSysMeetingUserList(SysMeetingUser sysMeetingUser)
    {
        return sysMeetingUserMapper.selectSysMeetingUserList(sysMeetingUser);
    }

    /**
     * 新增用户会议
     * 
     * @param sysMeetingUser 用户会议
     * @return 结果
     */
    @Override
    public int insertSysMeetingUser(SysMeetingUser sysMeetingUser)
    {
        return sysMeetingUserMapper.insertSysMeetingUser(sysMeetingUser);
    }

    /**
     * 修改用户会议
     * 
     * @param sysMeetingUser 用户会议
     * @return 结果
     */
    @Override
    public int updateSysMeetingUser(SysMeetingUser sysMeetingUser)
    {
        return sysMeetingUserMapper.updateSysMeetingUser(sysMeetingUser);
    }

    /**
     * 批量删除用户会议
     * 
     * @param meetingIds 需要删除的用户会议主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingUserByMeetingIds(String[] meetingIds)
    {
        return sysMeetingUserMapper.deleteSysMeetingUserByMeetingIds(meetingIds);
    }

    /**
     * 删除用户会议信息
     * 
     * @param meetingId 用户会议主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingUserByMeetingId(String meetingId)
    {
        return sysMeetingUserMapper.deleteSysMeetingUserByMeetingId(meetingId);
    }
}
