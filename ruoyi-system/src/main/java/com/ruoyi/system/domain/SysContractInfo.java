package com.ruoyi.system.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同详情对象 sys_contract_info
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysContractInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同甲乙方ID */
    private String infoId;

    /** 合同ID */
    @Excel(name = "合同ID")
    private String contractId;

    /** 甲方名称 */
    @Excel(name = "甲方名称")
    private String firstName;

    /** 乙方名称 */
    @Excel(name = "乙方名称")
    private String secondName;

    /** 甲方地址 */
    @Excel(name = "甲方地址")
    private String firstAddr;

    /** 乙方地址 */
    @Excel(name = "乙方地址")
    private String secondAddr;

    /** 甲方法人 */
    @Excel(name = "甲方法人")
    private String firstLegalPerson;

    /** 乙方法人 */
    @Excel(name = "乙方法人")
    private String secondLegalPerson;

    /** 甲方签订人 */
    @Excel(name = "甲方签订人")
    private String firstSignUser;

    /** 乙方签订人 */
    @Excel(name = "乙方签订人")
    private String secondSignUser;

    /** 甲方联系电话 */
    @Excel(name = "甲方联系电话")
    private Long firstMobile;

    /** 乙方联系电话 */
    @Excel(name = "乙方联系电话")
    private Long secondMobile;

    /** 甲方开户行 */
    @Excel(name = "甲方开户行")
    private String firstBank;

    /** 乙方开户行 */
    @Excel(name = "乙方开户行")
    private String secondBank;

    /** 甲方账号 */
    @Excel(name = "甲方账号")
    private String firstBankAccount;

    /** 乙方账号 */
    @Excel(name = "乙方账号")
    private String secondBankAccount;

    /** 甲方税号 */
    @Excel(name = "甲方税号")
    private String firstTaxNo;

    /** 乙方税号 */
    @Excel(name = "乙方税号")
    private String secondTaxNo;

    /** 合同信息 */
    private List<SysContract> sysContractList;

    public void setInfoId(String infoId) 
    {
        this.infoId = infoId;
    }

    public String getInfoId() 
    {
        return infoId;
    }
    public void setContractId(String contractId) 
    {
        this.contractId = contractId;
    }

    public String getContractId() 
    {
        return contractId;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getFirstName() 
    {
        return firstName;
    }
    public void setSecondName(String secondName) 
    {
        this.secondName = secondName;
    }

    public String getSecondName() 
    {
        return secondName;
    }
    public void setFirstAddr(String firstAddr) 
    {
        this.firstAddr = firstAddr;
    }

    public String getFirstAddr() 
    {
        return firstAddr;
    }
    public void setSecondAddr(String secondAddr) 
    {
        this.secondAddr = secondAddr;
    }

    public String getSecondAddr() 
    {
        return secondAddr;
    }
    public void setFirstLegalPerson(String firstLegalPerson) 
    {
        this.firstLegalPerson = firstLegalPerson;
    }

    public String getFirstLegalPerson() 
    {
        return firstLegalPerson;
    }
    public void setSecondLegalPerson(String secondLegalPerson) 
    {
        this.secondLegalPerson = secondLegalPerson;
    }

    public String getSecondLegalPerson() 
    {
        return secondLegalPerson;
    }
    public void setFirstSignUser(String firstSignUser) 
    {
        this.firstSignUser = firstSignUser;
    }

    public String getFirstSignUser() 
    {
        return firstSignUser;
    }
    public void setSecondSignUser(String secondSignUser) 
    {
        this.secondSignUser = secondSignUser;
    }

    public String getSecondSignUser() 
    {
        return secondSignUser;
    }
    public void setFirstMobile(Long firstMobile) 
    {
        this.firstMobile = firstMobile;
    }

    public Long getFirstMobile() 
    {
        return firstMobile;
    }
    public void setSecondMobile(Long secondMobile) 
    {
        this.secondMobile = secondMobile;
    }

    public Long getSecondMobile() 
    {
        return secondMobile;
    }
    public void setFirstBank(String firstBank) 
    {
        this.firstBank = firstBank;
    }

    public String getFirstBank() 
    {
        return firstBank;
    }
    public void setSecondBank(String secondBank) 
    {
        this.secondBank = secondBank;
    }

    public String getSecondBank() 
    {
        return secondBank;
    }
    public void setFirstBankAccount(String firstBankAccount) 
    {
        this.firstBankAccount = firstBankAccount;
    }

    public String getFirstBankAccount() 
    {
        return firstBankAccount;
    }
    public void setSecondBankAccount(String secondBankAccount) 
    {
        this.secondBankAccount = secondBankAccount;
    }

    public String getSecondBankAccount() 
    {
        return secondBankAccount;
    }
    public void setFirstTaxNo(String firstTaxNo) 
    {
        this.firstTaxNo = firstTaxNo;
    }

    public String getFirstTaxNo() 
    {
        return firstTaxNo;
    }
    public void setSecondTaxNo(String secondTaxNo) 
    {
        this.secondTaxNo = secondTaxNo;
    }

    public String getSecondTaxNo() 
    {
        return secondTaxNo;
    }

    public List<SysContract> getSysContractList()
    {
        return sysContractList;
    }

    public void setSysContractList(List<SysContract> sysContractList)
    {
        this.sysContractList = sysContractList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("infoId", getInfoId())
            .append("contractId", getContractId())
            .append("firstName", getFirstName())
            .append("secondName", getSecondName())
            .append("firstAddr", getFirstAddr())
            .append("secondAddr", getSecondAddr())
            .append("firstLegalPerson", getFirstLegalPerson())
            .append("secondLegalPerson", getSecondLegalPerson())
            .append("firstSignUser", getFirstSignUser())
            .append("secondSignUser", getSecondSignUser())
            .append("firstMobile", getFirstMobile())
            .append("secondMobile", getSecondMobile())
            .append("firstBank", getFirstBank())
            .append("secondBank", getSecondBank())
            .append("firstBankAccount", getFirstBankAccount())
            .append("secondBankAccount", getSecondBankAccount())
            .append("firstTaxNo", getFirstTaxNo())
            .append("secondTaxNo", getSecondTaxNo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("sysContractList", getSysContractList())
            .toString();
    }
}
