package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 讨论区对象 sys_discuss_info
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysDiscussInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String recordId;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String title;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sortNo;

    /** 模块类型 */
    @Excel(name = "模块类型")
    private String discussType;

    /** 版主 */
    @Excel(name = "版主")
    private Long userId;

    /** 开放人员 */
    @Excel(name = "开放人员")
    private String openUsers;

    /** 开放部门 */
    @Excel(name = "开放部门")
    private String openDepts;

    /** 开放职务 */
    @Excel(name = "开放职务")
    private String openRoles;

    /** 是否审批 */
    @Excel(name = "是否审批")
    private String status;

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSortNo(Long sortNo) 
    {
        this.sortNo = sortNo;
    }

    public Long getSortNo() 
    {
        return sortNo;
    }
    public void setDiscussType(String discussType) 
    {
        this.discussType = discussType;
    }

    public String getDiscussType() 
    {
        return discussType;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setOpenUsers(String openUsers) 
    {
        this.openUsers = openUsers;
    }

    public String getOpenUsers() 
    {
        return openUsers;
    }
    public void setOpenDepts(String openDepts) 
    {
        this.openDepts = openDepts;
    }

    public String getOpenDepts() 
    {
        return openDepts;
    }
    public void setOpenRoles(String openRoles) 
    {
        this.openRoles = openRoles;
    }

    public String getOpenRoles() 
    {
        return openRoles;
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
            .append("recordId", getRecordId())
            .append("title", getTitle())
            .append("sortNo", getSortNo())
            .append("discussType", getDiscussType())
            .append("userId", getUserId())
            .append("openUsers", getOpenUsers())
            .append("openDepts", getOpenDepts())
            .append("openRoles", getOpenRoles())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
