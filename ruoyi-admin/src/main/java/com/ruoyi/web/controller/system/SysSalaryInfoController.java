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
import com.ruoyi.system.domain.SysSalaryInfo;
import com.ruoyi.system.service.ISysSalaryInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工资详情Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/salary/info")
public class SysSalaryInfoController extends BaseController
{
    @Autowired
    private ISysSalaryInfoService sysSalaryInfoService;

    /**
     * 查询工资详情列表
     */
    @PreAuthorize("@ss.hasPermi('salary:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSalaryInfo sysSalaryInfo)
    {
        startPage();
        List<SysSalaryInfo> list = sysSalaryInfoService.selectSysSalaryInfoList(sysSalaryInfo);
        return getDataTable(list);
    }

    /**
     * 导出工资详情列表
     */
    @PreAuthorize("@ss.hasPermi('salary:info:export')")
    @Log(title = "工资详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSalaryInfo sysSalaryInfo)
    {
        List<SysSalaryInfo> list = sysSalaryInfoService.selectSysSalaryInfoList(sysSalaryInfo);
        ExcelUtil<SysSalaryInfo> util = new ExcelUtil<SysSalaryInfo>(SysSalaryInfo.class);
        util.exportExcel(response, list, "工资详情数据");
    }

    /**
     * 获取工资详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('salary:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysSalaryInfoService.selectSysSalaryInfoById(id));
    }

    /**
     * 新增工资详情
     */
    @PreAuthorize("@ss.hasPermi('salary:info:add')")
    @Log(title = "工资详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSalaryInfo sysSalaryInfo)
    {
        return toAjax(sysSalaryInfoService.insertSysSalaryInfo(sysSalaryInfo));
    }

    /**
     * 修改工资详情
     */
    @PreAuthorize("@ss.hasPermi('salary:info:edit')")
    @Log(title = "工资详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSalaryInfo sysSalaryInfo)
    {
        return toAjax(sysSalaryInfoService.updateSysSalaryInfo(sysSalaryInfo));
    }

    /**
     * 删除工资详情
     */
    @PreAuthorize("@ss.hasPermi('salary:info:remove')")
    @Log(title = "工资详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysSalaryInfoService.deleteSysSalaryInfoByIds(ids));
    }
}
