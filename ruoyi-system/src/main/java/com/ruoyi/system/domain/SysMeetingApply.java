package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会议申请对象 sys_meeting_apply
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
public class SysMeetingApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 预约ID */
    private String meetingId;

    /** 会议ID */
    @Excel(name = "会议ID")
    private String roomId;

    /** 已用容量 */
    @Excel(name = "已用容量")
    private Long useCapacity;

    /** 会议主题 */
    @Excel(name = "会议主题")
    private String subject;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 会议类型(1部门会议 2公司会议 3来访会议) */
    @Excel(name = "会议类型(1部门会议 2公司会议 3来访会议)")
    private String meetingType;

    /** 会议主持 */
    @Excel(name = "会议主持")
    private String chairUserName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String chairUserPhone;

    /** 预约状态(0预约中 1预约成功 2 预约失败) */
    @Excel(name = "预约状态(0预约中 1预约成功 2 预约失败)")
    private String status;

    /** 邮件通知 */
    @Excel(name = "邮件通知")
    private String mailStatus;

    /** 会议附件 */
    @Excel(name = "会议附件")
    private String fileAttach;

    public void setMeetingId(String meetingId) 
    {
        this.meetingId = meetingId;
    }

    public String getMeetingId() 
    {
        return meetingId;
    }
    public void setRoomId(String roomId) 
    {
        this.roomId = roomId;
    }

    public String getRoomId() 
    {
        return roomId;
    }
    public void setUseCapacity(Long useCapacity) 
    {
        this.useCapacity = useCapacity;
    }

    public Long getUseCapacity() 
    {
        return useCapacity;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setMeetingType(String meetingType) 
    {
        this.meetingType = meetingType;
    }

    public String getMeetingType() 
    {
        return meetingType;
    }
    public void setChairUserName(String chairUserName) 
    {
        this.chairUserName = chairUserName;
    }

    public String getChairUserName() 
    {
        return chairUserName;
    }
    public void setChairUserPhone(String chairUserPhone) 
    {
        this.chairUserPhone = chairUserPhone;
    }

    public String getChairUserPhone() 
    {
        return chairUserPhone;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setMailStatus(String mailStatus) 
    {
        this.mailStatus = mailStatus;
    }

    public String getMailStatus() 
    {
        return mailStatus;
    }
    public void setFileAttach(String fileAttach) 
    {
        this.fileAttach = fileAttach;
    }

    public String getFileAttach() 
    {
        return fileAttach;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("meetingId", getMeetingId())
            .append("roomId", getRoomId())
            .append("useCapacity", getUseCapacity())
            .append("subject", getSubject())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("meetingType", getMeetingType())
            .append("chairUserName", getChairUserName())
            .append("chairUserPhone", getChairUserPhone())
            .append("status", getStatus())
            .append("mailStatus", getMailStatus())
            .append("fileAttach", getFileAttach())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
