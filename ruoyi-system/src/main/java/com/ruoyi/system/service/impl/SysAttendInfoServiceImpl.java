package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAttendInfoMapper;
import com.ruoyi.system.domain.SysAttendInfo;
import com.ruoyi.system.service.ISysAttendInfoService;

/**
 * 员工考勤Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@Service
public class SysAttendInfoServiceImpl implements ISysAttendInfoService 
{
    @Autowired
    private SysAttendInfoMapper sysAttendInfoMapper;

    /**
     * 查询员工考勤
     * 
     * @param attendId 员工考勤主键
     * @return 员工考勤
     */
    @Override
    public SysAttendInfo selectSysAttendInfoByAttendId(String attendId)
    {
        return sysAttendInfoMapper.selectSysAttendInfoByAttendId(attendId);
    }

    /**
     * 查询员工考勤列表
     * 
     * @param sysAttendInfo 员工考勤
     * @return 员工考勤
     */
    @Override
    public List<SysAttendInfo> selectSysAttendInfoList(SysAttendInfo sysAttendInfo)
    {
        return sysAttendInfoMapper.selectSysAttendInfoList(sysAttendInfo);
    }

    /**
     * 新增员工考勤
     * 
     * @param sysAttendInfo 员工考勤
     * @return 结果
     */
    @Override
    public int insertSysAttendInfo(SysAttendInfo sysAttendInfo)
    {
        return sysAttendInfoMapper.insertSysAttendInfo(sysAttendInfo);
    }

    /**
     * 修改员工考勤
     * 
     * @param sysAttendInfo 员工考勤
     * @return 结果
     */
    @Override
    public int updateSysAttendInfo(SysAttendInfo sysAttendInfo)
    {
        return sysAttendInfoMapper.updateSysAttendInfo(sysAttendInfo);
    }

    /**
     * 批量删除员工考勤
     * 
     * @param attendIds 需要删除的员工考勤主键
     * @return 结果
     */
    @Override
    public int deleteSysAttendInfoByAttendIds(String[] attendIds)
    {
        return sysAttendInfoMapper.deleteSysAttendInfoByAttendIds(attendIds);
    }

    /**
     * 删除员工考勤信息
     * 
     * @param attendId 员工考勤主键
     * @return 结果
     */
    @Override
    public int deleteSysAttendInfoByAttendId(String attendId)
    {
        return sysAttendInfoMapper.deleteSysAttendInfoByAttendId(attendId);
    }
}
