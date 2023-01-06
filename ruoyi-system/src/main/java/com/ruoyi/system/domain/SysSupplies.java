package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 物资对象 sys_supplies
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysSupplies extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 物资ID */
    private Long sortId;

    /** 物资名称 */
    @Excel(name = "物资名称")
    private String sortName;

    /** 物资顺序 */
    @Excel(name = "物资顺序")
    private Long sortNo;

    /** 物资状态（0正常 1停用） */
    @Excel(name = "物资状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSortId(Long sortId) 
    {
        this.sortId = sortId;
    }

    public Long getSortId() 
    {
        return sortId;
    }
    public void setSortName(String sortName) 
    {
        this.sortName = sortName;
    }

    public String getSortName() 
    {
        return sortName;
    }
    public void setSortNo(Long sortNo) 
    {
        this.sortNo = sortNo;
    }

    public Long getSortNo() 
    {
        return sortNo;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sortId", getSortId())
            .append("parentId", getParentId())
            .append("ancestors", getAncestors())
            .append("sortName", getSortName())
            .append("sortNo", getSortNo())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
