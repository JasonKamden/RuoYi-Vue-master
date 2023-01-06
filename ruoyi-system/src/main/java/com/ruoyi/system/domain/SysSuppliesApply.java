package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物资申请对象 sys_supplies_apply
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysSuppliesApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long suppliesId;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 申请数量 */
    @Excel(name = "申请数量")
    private Long quantity;

    /** 发放数量 */
    @Excel(name = "发放数量")
    private Long approvalQuantity;

    /** 申请人 */
    @Excel(name = "申请人")
    private Long userId;

    /** 物资状态 */
    @Excel(name = "物资状态")
    private String status;

    public void setSuppliesId(Long suppliesId) 
    {
        this.suppliesId = suppliesId;
    }

    public Long getSuppliesId() 
    {
        return suppliesId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setApprovalQuantity(Long approvalQuantity) 
    {
        this.approvalQuantity = approvalQuantity;
    }

    public Long getApprovalQuantity() 
    {
        return approvalQuantity;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
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
            .append("suppliesId", getSuppliesId())
            .append("title", getTitle())
            .append("quantity", getQuantity())
            .append("approvalQuantity", getApprovalQuantity())
            .append("userId", getUserId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
