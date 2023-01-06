package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysMeetingUser;

/**
 * 用户会议Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public interface SysMeetingUserMapper 
{
    /**
     * 查询用户会议
     * 
     * @param meetingId 用户会议主键
     * @return 用户会议
     */
    public SysMeetingUser selectSysMeetingUserByMeetingId(String meetingId);

    /**
     * 查询用户会议列表
     * 
     * @param sysMeetingUser 用户会议
     * @return 用户会议集合
     */
    public List<SysMeetingUser> selectSysMeetingUserList(SysMeetingUser sysMeetingUser);

    /**
     * 新增用户会议
     * 
     * @param sysMeetingUser 用户会议
     * @return 结果
     */
    public int insertSysMeetingUser(SysMeetingUser sysMeetingUser);

    /**
     * 修改用户会议
     * 
     * @param sysMeetingUser 用户会议
     * @return 结果
     */
    public int updateSysMeetingUser(SysMeetingUser sysMeetingUser);

    /**
     * 删除用户会议
     * 
     * @param meetingId 用户会议主键
     * @return 结果
     */
    public int deleteSysMeetingUserByMeetingId(String meetingId);

    /**
     * 批量删除用户会议
     * 
     * @param meetingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysMeetingUserByMeetingIds(String[] meetingIds);
}
