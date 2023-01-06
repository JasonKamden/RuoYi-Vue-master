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
import com.ruoyi.system.domain.SysSalaryConfig;
import com.ruoyi.system.service.ISysSalaryConfigService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工资配置Controller
 * 
 * @author ruoyi
 * @date 2023-01-03
 */
@RestController
@RequestMapping("/salary/config")
public class SysSalaryConfigController extends BaseController
{
    @Autowired
    private ISysSalaryConfigService sysSalaryConfigService;

    /**
     * 查询工资配置列表
     */
    @PreAuthorize("@ss.hasPermi('salary:config:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSalaryConfig sysSalaryConfig)
    {
        startPage();
        List<SysSalaryConfig> list = sysSalaryConfigService.selectSysSalaryConfigList(sysSalaryConfig);
        return getDataTable(list);
    }

    /**
     * 导出工资配置列表
     */
    @PreAuthorize("@ss.hasPermi('salary:config:export')")
    @Log(title = "工资配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSalaryConfig sysSalaryConfig)
    {
        List<SysSalaryConfig> list = sysSalaryConfigService.selectSysSalaryConfigList(sysSalaryConfig);
        ExcelUtil<SysSalaryConfig> util = new ExcelUtil<SysSalaryConfig>(SysSalaryConfig.class);
        util.exportExcel(response, list, "工资配置数据");
    }

    /**
     * 获取工资配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('salary:config:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysSalaryConfigService.selectSysSalaryConfigById(id));
    }

    /**
     * 新增工资配置
     */
    @PreAuthorize("@ss.hasPermi('salary:config:add')")
    @Log(title = "工资配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSalaryConfig sysSalaryConfig)
    {
        return toAjax(sysSalaryConfigService.insertSysSalaryConfig(sysSalaryConfig));
    }

    /**
     * 修改工资配置
     */
    @PreAuthorize("@ss.hasPermi('salary:config:edit')")
    @Log(title = "工资配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSalaryConfig sysSalaryConfig)
    {
        return toAjax(sysSalaryConfigService.updateSysSalaryConfig(sysSalaryConfig));
    }

    /**
     * 删除工资配置
     */
    @PreAuthorize("@ss.hasPermi('salary:config:remove')")
    @Log(title = "工资配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysSalaryConfigService.deleteSysSalaryConfigByIds(ids));
    }
}
