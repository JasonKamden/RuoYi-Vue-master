package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同对象 sys_contract
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同ID */
    private String contractId;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String title;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractCode;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private String contractType;

    /** 合同开始期限 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同开始期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 合同结束期限 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同结束期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 签订时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "签订时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signTime;

    /** 结算方式 */
    @Excel(name = "结算方式")
    private String payType;

    /** 结算币种 */
    @Excel(name = "结算币种")
    private String cashType;

    /** 合同总额 */
    @Excel(name = "合同总额")
    private Long total;

    /** 已收款 */
    @Excel(name = "已收款")
    private Long realTotal;

    /** 是否为签订方 */
    @Excel(name = "是否为签订方")
    private String isFirst;

    /** 签订地址 */
    @Excel(name = "签订地址")
    private String signAddr;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 合同说明 */
    @Excel(name = "合同说明")
    private String contenxt;

    /** 合同附件 */
    @Excel(name = "合同附件")
    private String fileAttach;

    public void setContractId(String contractId) 
    {
        this.contractId = contractId;
    }

    public String getContractId() 
    {
        return contractId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContractCode(String contractCode) 
    {
        this.contractCode = contractCode;
    }

    public String getContractCode() 
    {
        return contractCode;
    }
    public void setContractType(String contractType) 
    {
        this.contractType = contractType;
    }

    public String getContractType() 
    {
        return contractType;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setSignTime(Date signTime) 
    {
        this.signTime = signTime;
    }

    public Date getSignTime() 
    {
        return signTime;
    }
    public void setPayType(String payType) 
    {
        this.payType = payType;
    }

    public String getPayType() 
    {
        return payType;
    }
    public void setCashType(String cashType) 
    {
        this.cashType = cashType;
    }

    public String getCashType() 
    {
        return cashType;
    }
    public void setTotal(Long total) 
    {
        this.total = total;
    }

    public Long getTotal() 
    {
        return total;
    }
    public void setRealTotal(Long realTotal) 
    {
        this.realTotal = realTotal;
    }

    public Long getRealTotal() 
    {
        return realTotal;
    }
    public void setIsFirst(String isFirst) 
    {
        this.isFirst = isFirst;
    }

    public String getIsFirst() 
    {
        return isFirst;
    }
    public void setSignAddr(String signAddr) 
    {
        this.signAddr = signAddr;
    }

    public String getSignAddr() 
    {
        return signAddr;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setContenxt(String contenxt) 
    {
        this.contenxt = contenxt;
    }

    public String getContenxt() 
    {
        return contenxt;
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
            .append("contractId", getContractId())
            .append("title", getTitle())
            .append("contractCode", getContractCode())
            .append("contractType", getContractType())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("signTime", getSignTime())
            .append("payType", getPayType())
            .append("cashType", getCashType())
            .append("total", getTotal())
            .append("realTotal", getRealTotal())
            .append("isFirst", getIsFirst())
            .append("signAddr", getSignAddr())
            .append("status", getStatus())
            .append("contenxt", getContenxt())
            .append("fileAttach", getFileAttach())
            .toString();
    }
}
