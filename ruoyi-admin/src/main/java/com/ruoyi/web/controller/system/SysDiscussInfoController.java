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
import com.ruoyi.system.domain.SysDiscussInfo;
import com.ruoyi.system.service.ISysDiscussInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 讨论区Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/info/discuss")
public class SysDiscussInfoController extends BaseController
{
    @Autowired
    private ISysDiscussInfoService sysDiscussInfoService;

    /**
     * 查询讨论区列表
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDiscussInfo sysDiscussInfo)
    {
        startPage();
        List<SysDiscussInfo> list = sysDiscussInfoService.selectSysDiscussInfoList(sysDiscussInfo);
        return getDataTable(list);
    }

    /**
     * 导出讨论区列表
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:export')")
    @Log(title = "讨论区", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysDiscussInfo sysDiscussInfo)
    {
        List<SysDiscussInfo> list = sysDiscussInfoService.selectSysDiscussInfoList(sysDiscussInfo);
        ExcelUtil<SysDiscussInfo> util = new ExcelUtil<SysDiscussInfo>(SysDiscussInfo.class);
        util.exportExcel(response, list, "讨论区数据");
    }

    /**
     * 获取讨论区详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") String recordId)
    {
        return success(sysDiscussInfoService.selectSysDiscussInfoByRecordId(recordId));
    }

    /**
     * 新增讨论区
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:add')")
    @Log(title = "讨论区", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDiscussInfo sysDiscussInfo)
    {
        return toAjax(sysDiscussInfoService.insertSysDiscussInfo(sysDiscussInfo));
    }

    /**
     * 修改讨论区
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:edit')")
    @Log(title = "讨论区", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDiscussInfo sysDiscussInfo)
    {
        return toAjax(sysDiscussInfoService.updateSysDiscussInfo(sysDiscussInfo));
    }

    /**
     * 删除讨论区
     */
    @PreAuthorize("@ss.hasPermi('info:discuss:remove')")
    @Log(title = "讨论区", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable String[] recordIds)
    {
        return toAjax(sysDiscussInfoService.deleteSysDiscussInfoByRecordIds(recordIds));
    }
}
