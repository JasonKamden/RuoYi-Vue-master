package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工资详情对象 sys_salary_info
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysSalaryInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户账号*/
    @Excel(name = "用户账号")
    private Long userId;

    /** 工作天数 */
    @Excel(name = "工作天数")
    private Long workDays;

    /** 加班时间 */
    @Excel(name = "加班时间")
    private Long otHour;

    /** 缺勤天数 */
    @Excel(name = "缺勤天数")
    private Long absentDays;

    /** 病假天数 */
    @Excel(name = "病假天数")
    private Long sickDays;

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
    public void setWorkDays(Long workDays) 
    {
        this.workDays = workDays;
    }

    public Long getWorkDays() 
    {
        return workDays;
    }
    public void setOtHour(Long otHour) 
    {
        this.otHour = otHour;
    }

    public Long getOtHour() 
    {
        return otHour;
    }
    public void setAbsentDays(Long absentDays) 
    {
        this.absentDays = absentDays;
    }

    public Long getAbsentDays() 
    {
        return absentDays;
    }
    public void setSickDays(Long sickDays) 
    {
        this.sickDays = sickDays;
    }

    public Long getSickDays() 
    {
        return sickDays;
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
            .append("workDays", getWorkDays())
            .append("otHour", getOtHour())
            .append("absentDays", getAbsentDays())
            .append("sickDays", getSickDays())
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
