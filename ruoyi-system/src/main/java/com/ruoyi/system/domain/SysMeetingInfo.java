package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会议信息对象 sys_meeting_info
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
public class SysMeetingInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 会议ID */
    private String roomId;

    /** 会议名称 */
    @Excel(name = "会议名称")
    private String roomName;

    /** 会议地点 */
    @Excel(name = "会议地点")
    private String roomPlace;

    /** 容量 */
    @Excel(name = "容量")
    private Long capacity;

    /** 会议状态（0正常 1停用 2已用） */
    @Excel(name = "会议状态", readConverterExp = "0=正常,1=停用,2=已用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setRoomId(String roomId) 
    {
        this.roomId = roomId;
    }

    public String getRoomId() 
    {
        return roomId;
    }
    public void setRoomName(String roomName) 
    {
        this.roomName = roomName;
    }

    public String getRoomName() 
    {
        return roomName;
    }
    public void setRoomPlace(String roomPlace) 
    {
        this.roomPlace = roomPlace;
    }

    public String getRoomPlace() 
    {
        return roomPlace;
    }
    public void setCapacity(Long capacity) 
    {
        this.capacity = capacity;
    }

    public Long getCapacity() 
    {
        return capacity;
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
            .append("roomId", getRoomId())
            .append("roomName", getRoomName())
            .append("roomPlace", getRoomPlace())
            .append("capacity", getCapacity())
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
