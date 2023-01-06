package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysAttendInfo;

/**
 * 员工考勤Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public interface SysAttendInfoMapper 
{
    /**
     * 查询员工考勤
     * 
     * @param attendId 员工考勤主键
     * @return 员工考勤
     */
    public SysAttendInfo selectSysAttendInfoByAttendId(String attendId);

    /**
     * 查询员工考勤列表
     * 
     * @param sysAttendInfo 员工考勤
     * @return 员工考勤集合
     */
    public List<SysAttendInfo> selectSysAttendInfoList(SysAttendInfo sysAttendInfo);

    /**
     * 新增员工考勤
     * 
     * @param sysAttendInfo 员工考勤
     * @return 结果
     */
    public int insertSysAttendInfo(SysAttendInfo sysAttendInfo);

    /**
     * 修改员工考勤
     * 
     * @param sysAttendInfo 员工考勤
     * @return 结果
     */
    public int updateSysAttendInfo(SysAttendInfo sysAttendInfo);

    /**
     * 删除员工考勤
     * 
     * @param attendId 员工考勤主键
     * @return 结果
     */
    public int deleteSysAttendInfoByAttendId(String attendId);

    /**
     * 批量删除员工考勤
     * 
     * @param attendIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAttendInfoByAttendIds(String[] attendIds);
}
