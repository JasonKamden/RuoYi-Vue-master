package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物资详情对象 sys_supplies_detail
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
public class SysSuppliesDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long suppliesId;

    /** 用品名称 */
    @Excel(name = "用品名称")
    private String suppliesName;

    /** 物资编号 */
    @Excel(name = "物资编号")
    private String suppliesCode;

    /** 物资用品ID */
    @Excel(name = "物资用品ID")
    private Long sortId;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String unit;

    /** 数量 */
    @Excel(name = "数量")
    private Long quantity;

    /** 物资品牌 */
    @Excel(name = "物资品牌")
    private String brand;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String model;

    public void setSuppliesId(Long suppliesId) 
    {
        this.suppliesId = suppliesId;
    }

    public Long getSuppliesId() 
    {
        return suppliesId;
    }
    public void setSuppliesName(String suppliesName) 
    {
        this.suppliesName = suppliesName;
    }

    public String getSuppliesName() 
    {
        return suppliesName;
    }
    public void setSuppliesCode(String suppliesCode) 
    {
        this.suppliesCode = suppliesCode;
    }

    public String getSuppliesCode() 
    {
        return suppliesCode;
    }
    public void setSortId(Long sortId) 
    {
        this.sortId = sortId;
    }

    public Long getSortId() 
    {
        return sortId;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("suppliesId", getSuppliesId())
            .append("suppliesName", getSuppliesName())
            .append("suppliesCode", getSuppliesCode())
            .append("sortId", getSortId())
            .append("unit", getUnit())
            .append("quantity", getQuantity())
            .append("brand", getBrand())
            .append("model", getModel())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
