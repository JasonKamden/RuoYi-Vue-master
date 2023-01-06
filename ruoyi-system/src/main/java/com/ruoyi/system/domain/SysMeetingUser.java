package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户会议对象 sys_meeting_user
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public class SysMeetingUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 会议ID */
    @Excel(name = "会议ID")
    private String meetingId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String nickName;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String email;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phoneNumber;

    /** 用户状态（0正常 1停用） */
    @Excel(name = "用户状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setMeetingId(String meetingId) 
    {
        this.meetingId = meetingId;
    }

    public String getMeetingId() 
    {
        return meetingId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("meetingId", getMeetingId())
            .append("userId", getUserId())
            .append("nickName", getNickName())
            .append("email", getEmail())
            .append("phoneNumber", getPhoneNumber())
            .append("status", getStatus())
            .toString();
    }
}
