package com.ruoyi.project.quality.controller;

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
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.quality.domain.GovernanceAuditField;
import com.ruoyi.project.quality.service.IGovernanceAuditFieldService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 数据治理字段结果Controller
 * 
 * @author cai
 * @date 2022-03-24
 */
@RestController
@RequestMapping("/quality/governancefield")
public class GovernanceAuditFieldController extends BaseController
{
    @Autowired
    private IGovernanceAuditFieldService governanceAuditFieldService;

    /**
     * 查询数据治理字段结果列表
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:list')")
    @GetMapping("/list")
    public TableDataInfo list(GovernanceAuditField governanceAuditField)
    {
        startPage();
        List<GovernanceAuditField> list = governanceAuditFieldService.selectGovernanceAuditFieldList(governanceAuditField);
        return getDataTable(list);
    }

    /**
     * 导出数据治理字段结果列表
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:export')")
    @Log(title = "数据治理字段结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GovernanceAuditField governanceAuditField)
    {
        List<GovernanceAuditField> list = governanceAuditFieldService.selectGovernanceAuditFieldList(governanceAuditField);
        ExcelUtil<GovernanceAuditField> util = new ExcelUtil<GovernanceAuditField>(GovernanceAuditField.class);
        util.exportExcel(response, list, "数据治理字段结果数据");
    }

    /**
     * 获取数据治理字段结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(governanceAuditFieldService.selectGovernanceAuditFieldById(id));
    }

    /**
     * 新增数据治理字段结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:add')")
    @Log(title = "数据治理字段结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GovernanceAuditField governanceAuditField)
    {
        return toAjax(governanceAuditFieldService.insertGovernanceAuditField(governanceAuditField));
    }

    /**
     * 修改数据治理字段结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:edit')")
    @Log(title = "数据治理字段结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GovernanceAuditField governanceAuditField)
    {
        return toAjax(governanceAuditFieldService.updateGovernanceAuditField(governanceAuditField));
    }

    /**
     * 删除数据治理字段结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancefield:remove')")
    @Log(title = "数据治理字段结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(governanceAuditFieldService.deleteGovernanceAuditFieldByIds(ids));
    }
}
