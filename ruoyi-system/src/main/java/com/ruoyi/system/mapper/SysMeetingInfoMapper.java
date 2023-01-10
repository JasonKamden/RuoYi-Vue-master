package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysMeetingInfo;

/**
 * 会议信息Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
public interface SysMeetingInfoMapper 
{
    /**
     * 查询会议信息
     * 
     * @param roomId 会议信息主键
     * @return 会议信息
     */
    public SysMeetingInfo selectSysMeetingInfoByRoomId(String roomId);

    /**
     * 查询会议信息列表
     * 
     * @param sysMeetingInfo 会议信息
     * @return 会议信息集合
     */
    public List<SysMeetingInfo> selectSysMeetingInfoList(SysMeetingInfo sysMeetingInfo);

    /**
     * 新增会议信息
     * 
     * @param sysMeetingInfo 会议信息
     * @return 结果
     */
    public int insertSysMeetingInfo(SysMeetingInfo sysMeetingInfo);

    /**
     * 修改会议信息
     * 
     * @param sysMeetingInfo 会议信息
     * @return 结果
     */
    public int updateSysMeetingInfo(SysMeetingInfo sysMeetingInfo);

    /**
     * 删除会议信息
     * 
     * @param roomId 会议信息主键
     * @return 结果
     */
    public int deleteSysMeetingInfoByRoomId(String roomId);

    /**
     * 批量删除会议信息
     * 
     * @param roomIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysMeetingInfoByRoomIds(String[] roomIds);
}
