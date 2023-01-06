package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工资配置对象 sys_salary_config
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysSalaryConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 用户账号
 */
    @Excel(name = "用户账号")
    private Long userId;

    /** 基本工资 */
    @Excel(name = "基本工资")
    private Long baseWage;

    /** 加班费用 */
    @Excel(name = "加班费用")
    private Long otPay;

    /** 社保 */
    @Excel(name = "社保")
    private Long socialWelfare;

    /** 公积金 */
    @Excel(name = "公积金")
    private Long providentFund;

    /** 实际工资 */
    @Excel(name = "实际工资")
    private Long sum;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setBaseWage(Long baseWage) 
    {
        this.baseWage = baseWage;
    }

    public Long getBaseWage() 
    {
        return baseWage;
    }
    public void setOtPay(Long otPay) 
    {
        this.otPay = otPay;
    }

    public Long getOtPay() 
    {
        return otPay;
    }
    public void setSocialWelfare(Long socialWelfare) 
    {
        this.socialWelfare = socialWelfare;
    }

    public Long getSocialWelfare() 
    {
        return socialWelfare;
    }
    public void setProvidentFund(Long providentFund) 
    {
        this.providentFund = providentFund;
    }

    public Long getProvidentFund() 
    {
        return providentFund;
    }
    public void setSum(Long sum) 
    {
        this.sum = sum;
    }

    public Long getSum() 
    {
        return sum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("baseWage", getBaseWage())
            .append("otPay", getOtPay())
            .append("socialWelfare", getSocialWelfare())
            .append("providentFund", getProvidentFund())
            .append("sum", getSum())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
