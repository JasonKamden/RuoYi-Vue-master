package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysMeetingNotes;
import com.ruoyi.system.service.ISysMeetingNotesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会议纪要Controller
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@RestController
@RequestMapping("/meeting/notes")
public class SysMeetingNotesController extends BaseController
{
    @Autowired
    private ISysMeetingNotesService sysMeetingNotesService;

    /**
     * 查询会议纪要列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysMeetingNotes sysMeetingNotes)
    {
        startPage();
        List<SysMeetingNotes> list = sysMeetingNotesService.selectSysMeetingNotesList(sysMeetingNotes);
        return getDataTable(list);
    }

    /**
     * 导出会议纪要列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:export')")
    @Log(title = "会议纪要", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysMeetingNotes sysMeetingNotes)
    {
        List<SysMeetingNotes> list = sysMeetingNotesService.selectSysMeetingNotesList(sysMeetingNotes);
        ExcelUtil<SysMeetingNotes> util = new ExcelUtil<SysMeetingNotes>(SysMeetingNotes.class);
        util.exportExcel(response, list, "会议纪要数据");
    }

    /**
     * 获取会议纪要详细信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:query')")
    @GetMapping(value = "/{notesId}")
    public AjaxResult getInfo(@PathVariable("notesId") String notesId)
    {
        return success(sysMeetingNotesService.selectSysMeetingNotesByNotesId(notesId));
    }

    /**
     * 新增会议纪要
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:add')")
    @Log(title = "会议纪要", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMeetingNotes sysMeetingNotes)
    {
        return toAjax(sysMeetingNotesService.insertSysMeetingNotes(sysMeetingNotes));
    }

    /**
     * 修改会议纪要
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:edit')")
    @Log(title = "会议纪要", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMeetingNotes sysMeetingNotes)
    {
        return toAjax(sysMeetingNotesService.updateSysMeetingNotes(sysMeetingNotes));
    }

    /**
     * 删除会议纪要
     */
    @PreAuthorize("@ss.hasPermi('meeting:notes:remove')")
    @Log(title = "会议纪要", businessType = BusinessType.DELETE)
	@DeleteMapping("/{notesIds}")
    public AjaxResult remove(@PathVariable String[] notesIds)
    {
        return toAjax(sysMeetingNotesService.deleteSysMeetingNotesByNotesIds(notesIds));
    }
}
