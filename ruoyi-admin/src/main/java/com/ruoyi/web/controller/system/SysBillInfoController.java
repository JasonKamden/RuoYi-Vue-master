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
import com.ruoyi.system.domain.SysBillInfo;
import com.ruoyi.system.service.ISysBillInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 票据详情Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/bill/info")
public class SysBillInfoController extends BaseController
{
    @Autowired
    private ISysBillInfoService sysBillInfoService;

    /**
     * 查询票据详情列表
     */
    @PreAuthorize("@ss.hasPermi('bill:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysBillInfo sysBillInfo)
    {
        startPage();
        List<SysBillInfo> list = sysBillInfoService.selectSysBillInfoList(sysBillInfo);
        return getDataTable(list);
    }

    /**
     * 导出票据详情列表
     */
    @PreAuthorize("@ss.hasPermi('bill:info:export')")
    @Log(title = "票据详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBillInfo sysBillInfo)
    {
        List<SysBillInfo> list = sysBillInfoService.selectSysBillInfoList(sysBillInfo);
        ExcelUtil<SysBillInfo> util = new ExcelUtil<SysBillInfo>(SysBillInfo.class);
        util.exportExcel(response, list, "票据详情数据");
    }

    /**
     * 获取票据详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('bill:info:query')")
    @GetMapping(value = "/{billId}")
    public AjaxResult getInfo(@PathVariable("billId") String billId)
    {
        return success(sysBillInfoService.selectSysBillInfoByBillId(billId));
    }

    /**
     * 新增票据详情
     */
    @PreAuthorize("@ss.hasPermi('bill:info:add')")
    @Log(title = "票据详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBillInfo sysBillInfo)
    {
        return toAjax(sysBillInfoService.insertSysBillInfo(sysBillInfo));
    }

    /**
     * 修改票据详情
     */
    @PreAuthorize("@ss.hasPermi('bill:info:edit')")
    @Log(title = "票据详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBillInfo sysBillInfo)
    {
        return toAjax(sysBillInfoService.updateSysBillInfo(sysBillInfo));
    }

    /**
     * 删除票据详情
     */
    @PreAuthorize("@ss.hasPermi('bill:info:remove')")
    @Log(title = "票据详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{billIds}")
    public AjaxResult remove(@PathVariable String[] billIds)
    {
        return toAjax(sysBillInfoService.deleteSysBillInfoByBillIds(billIds));
    }
}
