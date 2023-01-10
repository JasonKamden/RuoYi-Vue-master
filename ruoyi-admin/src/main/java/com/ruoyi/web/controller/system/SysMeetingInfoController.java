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
import com.ruoyi.system.domain.SysMeetingInfo;
import com.ruoyi.system.service.ISysMeetingInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会议信息Controller
 * 
 * @author ruoyi
 * @date 2022-12-28
 */
@RestController
@RequestMapping("/meeting/info")
public class SysMeetingInfoController extends BaseController
{
    @Autowired
    private ISysMeetingInfoService sysMeetingInfoService;

    /**
     * 查询会议信息列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysMeetingInfo sysMeetingInfo)
    {
        startPage();
        List<SysMeetingInfo> list = sysMeetingInfoService.selectSysMeetingInfoList(sysMeetingInfo);
        return getDataTable(list);
    }

    /**
     * 导出会议信息列表
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:export')")
    @Log(title = "会议信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysMeetingInfo sysMeetingInfo)
    {
        List<SysMeetingInfo> list = sysMeetingInfoService.selectSysMeetingInfoList(sysMeetingInfo);
        ExcelUtil<SysMeetingInfo> util = new ExcelUtil<SysMeetingInfo>(SysMeetingInfo.class);
        util.exportExcel(response, list, "会议信息数据");
    }

    /**
     * 获取会议信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:query')")
    @GetMapping(value = "/{roomId}")
    public AjaxResult getInfo(@PathVariable("roomId") String roomId)
    {
        return success(sysMeetingInfoService.selectSysMeetingInfoByRoomId(roomId));
    }

    /**
     * 新增会议信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:add')")
    @Log(title = "会议信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysMeetingInfo sysMeetingInfo)
    {
        return toAjax(sysMeetingInfoService.insertSysMeetingInfo(sysMeetingInfo));
    }

    /**
     * 修改会议信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:edit')")
    @Log(title = "会议信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysMeetingInfo sysMeetingInfo)
    {
        return toAjax(sysMeetingInfoService.updateSysMeetingInfo(sysMeetingInfo));
    }

    /**
     * 删除会议信息
     */
    @PreAuthorize("@ss.hasPermi('meeting:info:remove')")
    @Log(title = "会议信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{roomIds}")
    public AjaxResult remove(@PathVariable String[] roomIds)
    {
        return toAjax(sysMeetingInfoService.deleteSysMeetingInfoByRoomIds(roomIds));
    }
}
