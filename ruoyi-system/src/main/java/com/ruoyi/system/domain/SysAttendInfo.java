package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工考勤对象 sys_attend_info
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public class SysAttendInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private String attendId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String nickName;

    /** 打卡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "打卡日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date attendDate;

    /** 上午打卡时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "上午打卡时间", width = 30, dateFormat = "HH:mm:ss")
    private Date attendUpTime;

    /** 下午打卡时间 */
    @JsonFormat(pattern = "HH:mm:ss")
    @Excel(name = "下午打卡时间", width = 30, dateFormat = "HH:mm:ss")
    private Date attendDownTime;

    public void setAttendId(String attendId) 
    {
        this.attendId = attendId;
    }

    public String getAttendId() 
    {
        return attendId;
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
    public void setAttendDate(Date attendDate) 
    {
        this.attendDate = attendDate;
    }

    public Date getAttendDate() 
    {
        return attendDate;
    }
    public void setAttendUpTime(Date attendUpTime) 
    {
        this.attendUpTime = attendUpTime;
    }

    public Date getAttendUpTime() 
    {
        return attendUpTime;
    }
    public void setAttendDownTime(Date attendDownTime) 
    {
        this.attendDownTime = attendDownTime;
    }

    public Date getAttendDownTime() 
    {
        return attendDownTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("attendId", getAttendId())
            .append("userId", getUserId())
            .append("nickName", getNickName())
            .append("attendDate", getAttendDate())
            .append("attendUpTime", getAttendUpTime())
            .append("attendDownTime", getAttendDownTime())
            .append("remark", getRemark())
            .toString();
    }
}
