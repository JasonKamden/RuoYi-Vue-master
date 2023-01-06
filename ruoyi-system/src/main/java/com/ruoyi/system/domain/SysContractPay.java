package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同支付对象 sys_contract_pay
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysContractPay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private String recordId;

    /** 合同ID */
    @Excel(name = "合同ID")
    private String contractId;

    /** 收款人 */
    @Excel(name = "收款人")
    private Long userId;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date payeeTime;

    /** 转账方式 */
    @Excel(name = "转账方式")
    private String payeeType;

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }
    public void setContractId(String contractId) 
    {
        this.contractId = contractId;
    }

    public String getContractId() 
    {
        return contractId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setPayeeTime(Date payeeTime) 
    {
        this.payeeTime = payeeTime;
    }

    public Date getPayeeTime() 
    {
        return payeeTime;
    }
    public void setPayeeType(String payeeType) 
    {
        this.payeeType = payeeType;
    }

    public String getPayeeType() 
    {
        return payeeType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("contractId", getContractId())
            .append("userId", getUserId())
            .append("payeeTime", getPayeeTime())
            .append("payeeType", getPayeeType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
