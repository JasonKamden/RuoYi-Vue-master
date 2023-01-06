package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务对象 sys_task_manage
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysTaskManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 任务ID */
    private String taskId;

    /** 任务标题 */
    @Excel(name = "任务标题")
    private String taskName;

    /** 任务摘要 */
    @Excel(name = "任务摘要")
    private String taskContent;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private String taskType;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 当前状态 */
    @Excel(name = "当前状态")
    private String status;

    /** 工作量 */
    @Excel(name = "工作量")
    private Long duration;

    /** 任务监督员 */
    @Excel(name = "任务监督员")
    private Long supervisorAccountId;

    /** 任务参与人员 */
    @Excel(name = "任务参与人员")
    private String participantAccountId;

    /** 任务负责人 */
    @Excel(name = "任务负责人")
    private Long chargeAccountId;

    /** 任务级别 */
    @Excel(name = "任务级别")
    private String taskLevel;

    /** 相关附件 */
    @Excel(name = "相关附件")
    private String fileAttach;

    public void setTaskId(String taskId) 
    {
        this.taskId = taskId;
    }

    public String getTaskId() 
    {
        return taskId;
    }
    public void setTaskName(String taskName) 
    {
        this.taskName = taskName;
    }

    public String getTaskName() 
    {
        return taskName;
    }
    public void setTaskContent(String taskContent) 
    {
        this.taskContent = taskContent;
    }

    public String getTaskContent() 
    {
        return taskContent;
    }
    public void setTaskType(String taskType) 
    {
        this.taskType = taskType;
    }

    public String getTaskType() 
    {
        return taskType;
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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setSupervisorAccountId(Long supervisorAccountId) 
    {
        this.supervisorAccountId = supervisorAccountId;
    }

    public Long getSupervisorAccountId() 
    {
        return supervisorAccountId;
    }
    public void setParticipantAccountId(String participantAccountId) 
    {
        this.participantAccountId = participantAccountId;
    }

    public String getParticipantAccountId() 
    {
        return participantAccountId;
    }
    public void setChargeAccountId(Long chargeAccountId) 
    {
        this.chargeAccountId = chargeAccountId;
    }

    public Long getChargeAccountId() 
    {
        return chargeAccountId;
    }
    public void setTaskLevel(String taskLevel) 
    {
        this.taskLevel = taskLevel;
    }

    public String getTaskLevel() 
    {
        return taskLevel;
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
            .append("taskId", getTaskId())
            .append("taskName", getTaskName())
            .append("taskContent", getTaskContent())
            .append("taskType", getTaskType())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("duration", getDuration())
            .append("supervisorAccountId", getSupervisorAccountId())
            .append("participantAccountId", getParticipantAccountId())
            .append("chargeAccountId", getChargeAccountId())
            .append("taskLevel", getTaskLevel())
            .append("fileAttach", getFileAttach())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
