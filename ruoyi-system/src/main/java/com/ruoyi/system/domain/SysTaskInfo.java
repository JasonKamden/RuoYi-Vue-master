package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务进度对象 sys_task_info
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysTaskInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 任务ID */
    @Excel(name = "任务ID")
    private String taskId;

    /** 处理结果 */
    @Excel(name = "处理结果")
    private String content;

    /** 工期 */
    @Excel(name = "工期")
    private Long duration;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date completeDate;

    /** 当前进度 */
    @Excel(name = "当前进度")
    private Long progress;

    public void setTaskId(String taskId) 
    {
        this.taskId = taskId;
    }

    public String getTaskId() 
    {
        return taskId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setDuration(Long duration) 
    {
        this.duration = duration;
    }

    public Long getDuration() 
    {
        return duration;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setCompleteDate(Date completeDate) 
    {
        this.completeDate = completeDate;
    }

    public Date getCompleteDate() 
    {
        return completeDate;
    }
    public void setProgress(Long progress) 
    {
        this.progress = progress;
    }

    public Long getProgress() 
    {
        return progress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("content", getContent())
            .append("duration", getDuration())
            .append("startDate", getStartDate())
            .append("completeDate", getCompleteDate())
            .append("progress", getProgress())
            .toString();
    }
}
