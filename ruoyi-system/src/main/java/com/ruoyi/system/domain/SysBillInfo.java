package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 票据详情对象 sys_bill_info
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysBillInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 票据编号 */
    private String billId;

    /** 账单ID */
    @Excel(name = "账单ID")
    private String recordId;

    /** 发票编号 */
    @Excel(name = "发票编号")
    private String billCode;

    /** 发票类型 */
    @Excel(name = "发票类型")
    private String billType;

    /** 票据事件 */
    @Excel(name = "票据事件")
    private String isOpen;

    /** 发票金额 */
    @Excel(name = "发票金额")
    private String total;

    /** 开票日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开票日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date billTime;

    /** 发票状态 */
    @Excel(name = "发票状态")
    private String status;

    /** 附件 */
    @Excel(name = "附件")
    private String fileAttach;

    public void setBillId(String billId) 
    {
        this.billId = billId;
    }

    public String getBillId() 
    {
        return billId;
    }
    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setBillCode(String billCode) 
    {
        this.billCode = billCode;
    }

    public String getBillCode() 
    {
        return billCode;
    }
    public void setBillType(String billType) 
    {
        this.billType = billType;
    }

    public String getBillType() 
    {
        return billType;
    }
    public void setIsOpen(String isOpen) 
    {
        this.isOpen = isOpen;
    }

    public String getIsOpen() 
    {
        return isOpen;
    }
    public void setTotal(String total) 
    {
        this.total = total;
    }

    public String getTotal() 
    {
        return total;
    }
    public void setBillTime(Date billTime) 
    {
        this.billTime = billTime;
    }

    public Date getBillTime() 
    {
        return billTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("billId", getBillId())
            .append("recordId", getRecordId())
            .append("billCode", getBillCode())
            .append("billType", getBillType())
            .append("isOpen", getIsOpen())
            .append("total", getTotal())
            .append("billTime", getBillTime())
            .append("status", getStatus())
            .append("fileAttach", getFileAttach())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
