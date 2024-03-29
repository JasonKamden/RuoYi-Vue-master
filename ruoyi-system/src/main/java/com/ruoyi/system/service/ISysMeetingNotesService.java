package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysMeetingNotes;

/**
 * 会议纪要Service接口
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
public interface ISysMeetingNotesService 
{
    /**
     * 查询会议纪要
     * 
     * @param notesId 会议纪要主键
     * @return 会议纪要
     */
    public SysMeetingNotes selectSysMeetingNotesByNotesId(String notesId);

    /**
     * 查询会议纪要列表
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 会议纪要集合
     */
    public List<SysMeetingNotes> selectSysMeetingNotesList(SysMeetingNotes sysMeetingNotes);

    /**
     * 新增会议纪要
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 结果
     */
    public int insertSysMeetingNotes(SysMeetingNotes sysMeetingNotes);

    /**
     * 修改会议纪要
     * 
     * @param sysMeetingNotes 会议纪要
     * @return 结果
     */
    public int updateSysMeetingNotes(SysMeetingNotes sysMeetingNotes);

    /**
     * 批量删除会议纪要
     * 
     * @param notesIds 需要删除的会议纪要主键集合
     * @return 结果
     */
    public int deleteSysMeetingNotesByNotesIds(String[] notesIds);

    /**
     * 删除会议纪要信息
     * 
     * @param notesId 会议纪要主键
     * @return 结果
     */
    public int deleteSysMeetingNotesByNotesId(String notesId);
}
