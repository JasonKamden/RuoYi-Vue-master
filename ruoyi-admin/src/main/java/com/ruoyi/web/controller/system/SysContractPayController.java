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
import com.ruoyi.system.domain.SysContractPay;
import com.ruoyi.system.service.ISysContractPayService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同支付Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/contract/pay")
public class SysContractPayController extends BaseController
{
    @Autowired
    private ISysContractPayService sysContractPayService;

    /**
     * 查询合同支付列表
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysContractPay sysContractPay)
    {
        startPage();
        List<SysContractPay> list = sysContractPayService.selectSysContractPayList(sysContractPay);
        return getDataTable(list);
    }

    /**
     * 导出合同支付列表
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:export')")
    @Log(title = "合同支付", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysContractPay sysContractPay)
    {
        List<SysContractPay> list = sysContractPayService.selectSysContractPayList(sysContractPay);
        ExcelUtil<SysContractPay> util = new ExcelUtil<SysContractPay>(SysContractPay.class);
        util.exportExcel(response, list, "合同支付数据");
    }

    /**
     * 获取合同支付详细信息
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") String recordId)
    {
        return success(sysContractPayService.selectSysContractPayByRecordId(recordId));
    }

    /**
     * 新增合同支付
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:add')")
    @Log(title = "合同支付", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysContractPay sysContractPay)
    {
        return toAjax(sysContractPayService.insertSysContractPay(sysContractPay));
    }

    /**
     * 修改合同支付
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:edit')")
    @Log(title = "合同支付", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysContractPay sysContractPay)
    {
        return toAjax(sysContractPayService.updateSysContractPay(sysContractPay));
    }

    /**
     * 删除合同支付
     */
    @PreAuthorize("@ss.hasPermi('contract:pay:remove')")
    @Log(title = "合同支付", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable String[] recordIds)
    {
        return toAjax(sysContractPayService.deleteSysContractPayByRecordIds(recordIds));
    }
}
