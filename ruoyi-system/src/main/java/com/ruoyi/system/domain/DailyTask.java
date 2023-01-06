package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 日常任务对象 daily_task
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class DailyTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 任务ID */
    private Long taskId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String taskTitle;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private String taskType;

    /** 任务描述 */
    @Excel(name = "任务描述")
    private String taskDescription;

    /** 成果/交付物 */
    @Excel(name = "成果/交付物")
    private String taskDeliverables;

    /** 工时 */
    @Excel(name = "工时")
    private Long taskTime;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private String isEnabled;

    public void setTaskId(Long taskId) 
    {
        this.taskId = taskId;
    }

    public Long getTaskId() 
    {
        return taskId;
    }
    public void setTaskTitle(String taskTitle) 
    {
        this.taskTitle = taskTitle;
    }

    public String getTaskTitle() 
    {
        return taskTitle;
    }
    public void setTaskType(String taskType) 
    {
        this.taskType = taskType;
    }

    public String getTaskType() 
    {
        return taskType;
    }
    public void setTaskDescription(String taskDescription) 
    {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() 
    {
        return taskDescription;
    }
    public void setTaskDeliverables(String taskDeliverables) 
    {
        this.taskDeliverables = taskDeliverables;
    }

    public String getTaskDeliverables() 
    {
        return taskDeliverables;
    }
    public void setTaskTime(Long taskTime) 
    {
        this.taskTime = taskTime;
    }

    public Long getTaskTime() 
    {
        return taskTime;
    }
    public void setIsEnabled(String isEnabled) 
    {
        this.isEnabled = isEnabled;
    }

    public String getIsEnabled() 
    {
        return isEnabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("taskTitle", getTaskTitle())
            .append("taskType", getTaskType())
            .append("taskDescription", getTaskDescription())
            .append("taskDeliverables", getTaskDeliverables())
            .append("taskTime", getTaskTime())
            .append("isEnabled", getIsEnabled())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
