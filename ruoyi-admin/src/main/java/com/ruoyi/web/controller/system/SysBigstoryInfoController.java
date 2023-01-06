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
import com.ruoyi.system.domain.SysBigstoryInfo;
import com.ruoyi.system.service.ISysBigstoryInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大事记管理Controller
 * 
 * @author ruoyi
 * @date 2022-12-29
 */
@RestController
@RequestMapping("/info/bigstory")
public class SysBigstoryInfoController extends BaseController
{
    @Autowired
    private ISysBigstoryInfoService sysBigstoryInfoService;

    /**
     * 查询大事记管理列表
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysBigstoryInfo sysBigstoryInfo)
    {
        startPage();
        List<SysBigstoryInfo> list = sysBigstoryInfoService.selectSysBigstoryInfoList(sysBigstoryInfo);
        return getDataTable(list);
    }

    /**
     * 导出大事记管理列表
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:export')")
    @Log(title = "大事记管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBigstoryInfo sysBigstoryInfo)
    {
        List<SysBigstoryInfo> list = sysBigstoryInfoService.selectSysBigstoryInfoList(sysBigstoryInfo);
        ExcelUtil<SysBigstoryInfo> util = new ExcelUtil<SysBigstoryInfo>(SysBigstoryInfo.class);
        util.exportExcel(response, list, "大事记管理数据");
    }

    /**
     * 获取大事记管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:query')")
    @GetMapping(value = "/{attachId}")
    public AjaxResult getInfo(@PathVariable("attachId") String attachId)
    {
        return success(sysBigstoryInfoService.selectSysBigstoryInfoByAttachId(attachId));
    }

    /**
     * 新增大事记管理
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:add')")
    @Log(title = "大事记管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBigstoryInfo sysBigstoryInfo)
    {
        return toAjax(sysBigstoryInfoService.insertSysBigstoryInfo(sysBigstoryInfo));
    }

    /**
     * 修改大事记管理
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:edit')")
    @Log(title = "大事记管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBigstoryInfo sysBigstoryInfo)
    {
        return toAjax(sysBigstoryInfoService.updateSysBigstoryInfo(sysBigstoryInfo));
    }

    /**
     * 删除大事记管理
     */
    @PreAuthorize("@ss.hasPermi('info:bigstory:remove')")
    @Log(title = "大事记管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attachIds}")
    public AjaxResult remove(@PathVariable String[] attachIds)
    {
        return toAjax(sysBigstoryInfoService.deleteSysBigstoryInfoByAttachIds(attachIds));
    }
}
