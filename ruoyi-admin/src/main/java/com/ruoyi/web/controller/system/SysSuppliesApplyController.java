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
import com.ruoyi.system.domain.SysSuppliesApply;
import com.ruoyi.system.service.ISysSuppliesApplyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物资申请Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/supplies/apply")
public class SysSuppliesApplyController extends BaseController
{
    @Autowired
    private ISysSuppliesApplyService sysSuppliesApplyService;

    /**
     * 查询物资申请列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSuppliesApply sysSuppliesApply)
    {
        startPage();
        List<SysSuppliesApply> list = sysSuppliesApplyService.selectSysSuppliesApplyList(sysSuppliesApply);
        return getDataTable(list);
    }

    /**
     * 导出物资申请列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:export')")
    @Log(title = "物资申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSuppliesApply sysSuppliesApply)
    {
        List<SysSuppliesApply> list = sysSuppliesApplyService.selectSysSuppliesApplyList(sysSuppliesApply);
        ExcelUtil<SysSuppliesApply> util = new ExcelUtil<SysSuppliesApply>(SysSuppliesApply.class);
        util.exportExcel(response, list, "物资申请数据");
    }

    /**
     * 获取物资申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:query')")
    @GetMapping(value = "/{suppliesId}")
    public AjaxResult getInfo(@PathVariable("suppliesId") Long suppliesId)
    {
        return success(sysSuppliesApplyService.selectSysSuppliesApplyBySuppliesId(suppliesId));
    }

    /**
     * 新增物资申请
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:add')")
    @Log(title = "物资申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSuppliesApply sysSuppliesApply)
    {
        return toAjax(sysSuppliesApplyService.insertSysSuppliesApply(sysSuppliesApply));
    }

    /**
     * 修改物资申请
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:edit')")
    @Log(title = "物资申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSuppliesApply sysSuppliesApply)
    {
        return toAjax(sysSuppliesApplyService.updateSysSuppliesApply(sysSuppliesApply));
    }

    /**
     * 删除物资申请
     */
    @PreAuthorize("@ss.hasPermi('supplies:apply:remove')")
    @Log(title = "物资申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{suppliesIds}")
    public AjaxResult remove(@PathVariable Long[] suppliesIds)
    {
        return toAjax(sysSuppliesApplyService.deleteSysSuppliesApplyBySuppliesIds(suppliesIds));
    }
}
