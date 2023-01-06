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
import com.ruoyi.system.domain.SysSupplies;
import com.ruoyi.system.service.ISysSuppliesService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 物资Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/supplies/entry")
public class SysSuppliesController extends BaseController
{
    @Autowired
    private ISysSuppliesService sysSuppliesService;

    /**
     * 查询物资列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:list')")
    @GetMapping("/list")
    public AjaxResult list(SysSupplies sysSupplies)
    {
        List<SysSupplies> list = sysSuppliesService.selectSysSuppliesList(sysSupplies);
        return success(list);
    }

    /**
     * 导出物资列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:export')")
    @Log(title = "物资", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSupplies sysSupplies)
    {
        List<SysSupplies> list = sysSuppliesService.selectSysSuppliesList(sysSupplies);
        ExcelUtil<SysSupplies> util = new ExcelUtil<SysSupplies>(SysSupplies.class);
        util.exportExcel(response, list, "物资数据");
    }

    /**
     * 获取物资详细信息
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:query')")
    @GetMapping(value = "/{sortId}")
    public AjaxResult getInfo(@PathVariable("sortId") Long sortId)
    {
        return success(sysSuppliesService.selectSysSuppliesBySortId(sortId));
    }

    /**
     * 新增物资
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:add')")
    @Log(title = "物资", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSupplies sysSupplies)
    {
        return toAjax(sysSuppliesService.insertSysSupplies(sysSupplies));
    }

    /**
     * 修改物资
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:edit')")
    @Log(title = "物资", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSupplies sysSupplies)
    {
        return toAjax(sysSuppliesService.updateSysSupplies(sysSupplies));
    }

    /**
     * 删除物资
     */
    @PreAuthorize("@ss.hasPermi('supplies:entry:remove')")
    @Log(title = "物资", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sortIds}")
    public AjaxResult remove(@PathVariable Long[] sortIds)
    {
        return toAjax(sysSuppliesService.deleteSysSuppliesBySortIds(sortIds));
    }
}
