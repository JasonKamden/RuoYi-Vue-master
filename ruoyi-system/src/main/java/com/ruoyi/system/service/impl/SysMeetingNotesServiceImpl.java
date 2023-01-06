package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysMeetingNotesMapper;
import com.ruoyi.system.domain.SysMeetingNotes;
import com.ruoyi.system.service.ISysMeetingNotesService;

/**
 * 会议纪要Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@Service
public class SysMeetingNotesServiceImpl implements ISysMeetingNotesService 
{
    @Autowired
    private SysMeetingNotesMapper sysMeetingNotesMapper;

    /**
     * 查询会议纪要
     * 
     * @param notesId 会议纪要主键
     * @return 会议纪要
     */
    @Override
    public SysMeetingNotes selectSysMeetingNotesByNotesId(String notesId)
    {
        return sysMeetingNotesMapper.selectSysMeetingNotesByNotesId(notesId);
    }

    /**
     * 查询会议纪要列表
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 会议纪要
     */
    @Override
    public List<SysMeetingNotes> selectSysMeetingNotesList(SysMeetingNotes sysMeetingNotes)
    {
        return sysMeetingNotesMapper.selectSysMeetingNotesList(sysMeetingNotes);
    }

    /**
     * 新增会议纪要
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 结果
     */
    @Override
    public int insertSysMeetingNotes(SysMeetingNotes sysMeetingNotes)
    {
        sysMeetingNotes.setCreateTime(DateUtils.getNowDate());
        return sysMeetingNotesMapper.insertSysMeetingNotes(sysMeetingNotes);
    }

    /**
     * 修改会议纪要
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 结果
     */
    @Override
    public int updateSysMeetingNotes(SysMeetingNotes sysMeetingNotes)
    {
        sysMeetingNotes.setUpdateTime(DateUtils.getNowDate());
        return sysMeetingNotesMapper.updateSysMeetingNotes(sysMeetingNotes);
    }

    /**
     * 批量删除会议纪要
     * 
     * @param notesIds 需要删除的会议纪要主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingNotesByNotesIds(String[] notesIds)
    {
        return sysMeetingNotesMapper.deleteSysMeetingNotesByNotesIds(notesIds);
    }

    /**
     * 删除会议纪要信息
     * 
     * @param notesId 会议纪要主键
     * @return 结果
     */
    @Override
    public int deleteSysMeetingNotesByNotesId(String notesId)
    {
        return sysMeetingNotesMapper.deleteSysMeetingNotesByNotesId(notesId);
    }
}
