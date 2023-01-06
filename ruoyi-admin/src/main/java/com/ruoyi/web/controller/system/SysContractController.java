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
import com.ruoyi.system.domain.SysContract;
import com.ruoyi.system.service.ISysContractService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/contract/create")
public class SysContractController extends BaseController
{
    @Autowired
    private ISysContractService sysContractService;

    /**
     * 查询合同列表
     */
    @PreAuthorize("@ss.hasPermi('contract:create:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysContract sysContract)
    {
        startPage();
        List<SysContract> list = sysContractService.selectSysContractList(sysContract);
        return getDataTable(list);
    }

    /**
     * 导出合同列表
     */
    @PreAuthorize("@ss.hasPermi('contract:create:export')")
    @Log(title = "合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysContract sysContract)
    {
        List<SysContract> list = sysContractService.selectSysContractList(sysContract);
        ExcelUtil<SysContract> util = new ExcelUtil<SysContract>(SysContract.class);
        util.exportExcel(response, list, "合同数据");
    }

    /**
     * 获取合同详细信息
     */
    @PreAuthorize("@ss.hasPermi('contract:create:query')")
    @GetMapping(value = "/{contractId}")
    public AjaxResult getInfo(@PathVariable("contractId") String contractId)
    {
        return success(sysContractService.selectSysContractByContractId(contractId));
    }

    /**
     * 新增合同
     */
    @PreAuthorize("@ss.hasPermi('contract:create:add')")
    @Log(title = "合同", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysContract sysContract)
    {
        return toAjax(sysContractService.insertSysContract(sysContract));
    }

    /**
     * 修改合同
     */
    @PreAuthorize("@ss.hasPermi('contract:create:edit')")
    @Log(title = "合同", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysContract sysContract)
    {
        return toAjax(sysContractService.updateSysContract(sysContract));
    }

    /**
     * 删除合同
     */
    @PreAuthorize("@ss.hasPermi('contract:create:remove')")
    @Log(title = "合同", businessType = BusinessType.DELETE)
	@DeleteMapping("/{contractIds}")
    public AjaxResult remove(@PathVariable String[] contractIds)
    {
        return toAjax(sysContractService.deleteSysContractByContractIds(contractIds));
    }
}
