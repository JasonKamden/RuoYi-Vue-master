package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysMeetingApply;

/**
 * 会议申请Service接口
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
public interface ISysMeetingApplyService 
{
    /**
     * 查询会议申请
     * 
     * @param meetingId 会议申请主键
     * @return 会议申请
     */
    public SysMeetingApply selectSysMeetingApplyByMeetingId(String meetingId);

    /**
     * 查询会议申请列表
     * 
     * @param sysMeetingApply 会议申请
     * @return 会议申请集合
     */
    public List<SysMeetingApply> selectSysMeetingApplyList(SysMeetingApply sysMeetingApply);

    /**
     * 新增会议申请
     * 
     * @param sysMeetingApply 会议申请
     * @return 结果
     */
    public int insertSysMeetingApply(SysMeetingApply sysMeetingApply);

    /**
     * 修改会议申请
     * 
     * @param sysMeetingApply 会议申请
     * @return 结果
     */
    public int updateSysMeetingApply(SysMeetingApply sysMeetingApply);

    /**
     * 批量删除会议申请
     * 
     * @param meetingIds 需要删除的会议申请主键集合
     * @return 结果
     */
    public int deleteSysMeetingApplyByMeetingIds(String[] meetingIds);

    /**
     * 删除会议申请信息
     * 
     * @param meetingId 会议申请主键
     * @return 结果
     */
    public int deleteSysMeetingApplyByMeetingId(String meetingId);
}
