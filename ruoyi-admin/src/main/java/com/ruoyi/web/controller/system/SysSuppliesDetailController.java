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
import com.ruoyi.system.domain.SysSuppliesDetail;
import com.ruoyi.system.service.ISysSuppliesDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物资详情Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/supplies/detail")
public class SysSuppliesDetailController extends BaseController
{
    @Autowired
    private ISysSuppliesDetailService sysSuppliesDetailService;

    /**
     * 查询物资详情列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSuppliesDetail sysSuppliesDetail)
    {
        startPage();
        List<SysSuppliesDetail> list = sysSuppliesDetailService.selectSysSuppliesDetailList(sysSuppliesDetail);
        return getDataTable(list);
    }

    /**
     * 导出物资详情列表
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:export')")
    @Log(title = "物资详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSuppliesDetail sysSuppliesDetail)
    {
        List<SysSuppliesDetail> list = sysSuppliesDetailService.selectSysSuppliesDetailList(sysSuppliesDetail);
        ExcelUtil<SysSuppliesDetail> util = new ExcelUtil<SysSuppliesDetail>(SysSuppliesDetail.class);
        util.exportExcel(response, list, "物资详情数据");
    }

    /**
     * 获取物资详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:query')")
    @GetMapping(value = "/{suppliesId}")
    public AjaxResult getInfo(@PathVariable("suppliesId") Long suppliesId)
    {
        return success(sysSuppliesDetailService.selectSysSuppliesDetailBySuppliesId(suppliesId));
    }

    /**
     * 新增物资详情
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:add')")
    @Log(title = "物资详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSuppliesDetail sysSuppliesDetail)
    {
        return toAjax(sysSuppliesDetailService.insertSysSuppliesDetail(sysSuppliesDetail));
    }

    /**
     * 修改物资详情
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:edit')")
    @Log(title = "物资详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSuppliesDetail sysSuppliesDetail)
    {
        return toAjax(sysSuppliesDetailService.updateSysSuppliesDetail(sysSuppliesDetail));
    }

    /**
     * 删除物资详情
     */
    @PreAuthorize("@ss.hasPermi('supplies:detail:remove')")
    @Log(title = "物资详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{suppliesIds}")
    public AjaxResult remove(@PathVariable Long[] suppliesIds)
    {
        return toAjax(sysSuppliesDetailService.deleteSysSuppliesDetailBySuppliesIds(suppliesIds));
    }
}
