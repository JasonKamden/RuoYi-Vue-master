package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大事记管理对象 sys_bigstory_info
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public class SysBigstoryInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String attachId;

    /** 事记标题 */
    @Excel(name = "事记标题")
    private String title;

    /** 事记日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "事记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date happenTime;

    /** 事记类型 */
    @Excel(name = "事记类型")
    private String type;

    /** 事记摘要 */
    @Excel(name = "事记摘要")
    private String context;

    /** 事记图片 */
    @Excel(name = "事记图片")
    private String mainPicture;

    /** 附件 */
    @Excel(name = "附件")
    private String attachFile;

    public void setAttachId(String attachId) 
    {
        this.attachId = attachId;
    }

    public String getAttachId() 
    {
        return attachId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setHappenTime(Date happenTime) 
    {
        this.happenTime = happenTime;
    }

    public Date getHappenTime() 
    {
        return happenTime;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setContext(String context) 
    {
        this.context = context;
    }

    public String getContext() 
    {
        return context;
    }
    public void setMainPicture(String mainPicture) 
    {
        this.mainPicture = mainPicture;
    }

    public String getMainPicture() 
    {
        return mainPicture;
    }
    public void setAttachFile(String attachFile) 
    {
        this.attachFile = attachFile;
    }

    public String getAttachFile() 
    {
        return attachFile;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("attachId", getAttachId())
            .append("title", getTitle())
            .append("happenTime", getHappenTime())
            .append("type", getType())
            .append("context", getContext())
            .append("mainPicture", getMainPicture())
            .append("attachFile", getAttachFile())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
