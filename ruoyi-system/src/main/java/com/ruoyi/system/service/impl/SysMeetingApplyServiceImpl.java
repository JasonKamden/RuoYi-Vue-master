package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMeetingApplyMapper;
import com.ruoyi.system.domain.SysMeetingApply;
import com.ruoyi.system.service.ISysMeetingApplyService;

/**
 * 会议申请Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
@Service
public class SysMeetingApplyServiceImpl implements ISysMeetingApplyService 
{
    @Autowired
    private SysMeetingApplyMapper sysMeetingApplyMapper;

    /**
     * 查询会议申请
     * 
     * @param meetingId 会议申请主键
     * @return 会议申请
     */
    @Override
    public SysMeetingApply selectSysMeetingApplyByMeetingId(String meetingId)
    {
        return sysMeetingApplyMapper.selectSysMeetingApplyByMeetingId(meetingId);
    }

    /**
     * 查询会议申请列表
     * 
     * @param sysMeetingApply 会议申请
     * @return 会议申请
     */
    @Override
    public List<SysMeetingApply> selectSysMeetingApplyList(SysMeetingApply sysMeetingApply)
    {
        return sysMeetingApplyMapper.selectSysMeetingApplyList(sysMeetingApply);
    }

    /**
     * 新增会议申请
     * 
     * @param sysMeetingApply 会议申请
     * @return 结果
     */
    @Override
    public int insertSysMeetingApply(SysMeetingApply sysMeetingApply)
    {
        sysMeetingApply.setCreateTime(DateUtils.getNowDate());
        sysMeetingApply.setMeetingId(IdUtils.simpleUUID());
        return sysMeetingApplyMapper.insertSysMeetingApply(sysMeetingApply);
    }

    /**
     * 修改会议申请
     * 
     * @param sysMeetingApply 会议申请
     * @return 结果
     */
    @Override
    public int updateSysMeetingApply(SysMeetingApply sysMeetingApply)
    {
        sysMeetingApply.setUpdateTime(DateUtils.getNowDate());
        return sysMeetingApplyMapper.updateSysMeetingApply(sysMeetingApply);
    }

    /**
     * 批量删除会议申请
     * 
     * @param meetingIds 需要删除的会议申请主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingApplyByMeetingIds(String[] meetingIds)
    {
        return sysMeetingApplyMapper.deleteSysMeetingApplyByMeetingIds(meetingIds);
    }

    /**
     * 删除会议申请信息
     * 
     * @param meetingId 会议申请主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingApplyByMeetingId(String meetingId)
    {
        return sysMeetingApplyMapper.deleteSysMeetingApplyByMeetingId(meetingId);
    }
}
