package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会议纪要对象 sys_meeting_notes
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public class SysMeetingNotes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 纪要ID */
    private String notesId;

    /** 预约ID */
    @Excel(name = "预约ID")
    private String meetingId;

    /** 纪要标题 */
    @Excel(name = "纪要标题")
    private String notesTitle;

    /** 纪要员 */
    @Excel(name = "纪要员")
    private String notesUser;

    /** 纪要内容 */
    @Excel(name = "纪要内容")
    private String content;

    /** 纪要文件 */
    @Excel(name = "纪要文件")
    private String notesFile;

    public void setNotesId(String notesId) 
    {
        this.notesId = notesId;
    }

    public String getNotesId() 
    {
        return notesId;
    }
    public void setMeetingId(String meetingId) 
    {
        this.meetingId = meetingId;
    }

    public String getMeetingId() 
    {
        return meetingId;
    }
    public void setNotesTitle(String notesTitle) 
    {
        this.notesTitle = notesTitle;
    }

    public String getNotesTitle() 
    {
        return notesTitle;
    }
    public void setNotesUser(String notesUser) 
    {
        this.notesUser = notesUser;
    }

    public String getNotesUser() 
    {
        return notesUser;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setNotesFile(String notesFile) 
    {
        this.notesFile = notesFile;
    }

    public String getNotesFile() 
    {
        return notesFile;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("notesId", getNotesId())
            .append("meetingId", getMeetingId())
            .append("notesTitle", getNotesTitle())
            .append("notesUser", getNotesUser())
            .append("content", getContent())
            .append("notesFile", getNotesFile())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
