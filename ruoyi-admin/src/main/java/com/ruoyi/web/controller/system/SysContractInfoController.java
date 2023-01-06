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
import com.ruoyi.system.domain.SysContractInfo;
import com.ruoyi.system.service.ISysContractInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同详情Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/contract/info")
public class SysContractInfoController extends BaseController
{
    @Autowired
    private ISysContractInfoService sysContractInfoService;

    /**
     * 查询合同详情列表
     */
    @PreAuthorize("@ss.hasPermi('contract:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysContractInfo sysContractInfo)
    {
        startPage();
        List<SysContractInfo> list = sysContractInfoService.selectSysContractInfoList(sysContractInfo);
        return getDataTable(list);
    }

    /**
     * 导出合同详情列表
     */
    @PreAuthorize("@ss.hasPermi('contract:info:export')")
    @Log(title = "合同详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysContractInfo sysContractInfo)
    {
        List<SysContractInfo> list = sysContractInfoService.selectSysContractInfoList(sysContractInfo);
        ExcelUtil<SysContractInfo> util = new ExcelUtil<SysContractInfo>(SysContractInfo.class);
        util.exportExcel(response, list, "合同详情数据");
    }

    /**
     * 获取合同详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('contract:info:query')")
    @GetMapping(value = "/{infoId}")
    public AjaxResult getInfo(@PathVariable("infoId") String infoId)
    {
        return success(sysContractInfoService.selectSysContractInfoByInfoId(infoId));
    }

    /**
     * 新增合同详情
     */
    @PreAuthorize("@ss.hasPermi('contract:info:add')")
    @Log(title = "合同详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysContractInfo sysContractInfo)
    {
        return toAjax(sysContractInfoService.insertSysContractInfo(sysContractInfo));
    }

    /**
     * 修改合同详情
     */
    @PreAuthorize("@ss.hasPermi('contract:info:edit')")
    @Log(title = "合同详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysContractInfo sysContractInfo)
    {
        return toAjax(sysContractInfoService.updateSysContractInfo(sysContractInfo));
    }

    /**
     * 删除合同详情
     */
    @PreAuthorize("@ss.hasPermi('contract:info:remove')")
    @Log(title = "合同详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable String[] infoIds)
    {
        return toAjax(sysContractInfoService.deleteSysContractInfoByInfoIds(infoIds));
    }
}
