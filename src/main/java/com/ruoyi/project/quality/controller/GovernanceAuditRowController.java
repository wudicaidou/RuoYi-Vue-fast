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
import com.ruoyi.project.quality.domain.GovernanceAuditRow;
import com.ruoyi.project.quality.service.IGovernanceAuditRowService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 数据治理行结果Controller
 * 
 * @author cai
 * @date 2022-03-24
 */
@RestController
@RequestMapping("/quality/governancerow")
public class GovernanceAuditRowController extends BaseController
{
    @Autowired
    private IGovernanceAuditRowService governanceAuditRowService;

    /**
     * 查询数据治理行结果列表
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:list')")
    @GetMapping("/list")
    public TableDataInfo list(GovernanceAuditRow governanceAuditRow)
    {
        startPage();
        List<GovernanceAuditRow> list = governanceAuditRowService.selectGovernanceAuditRowList(governanceAuditRow);
        return getDataTable(list);
    }

    /**
     * 导出数据治理行结果列表
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:export')")
    @Log(title = "数据治理行结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GovernanceAuditRow governanceAuditRow)
    {
        List<GovernanceAuditRow> list = governanceAuditRowService.selectGovernanceAuditRowList(governanceAuditRow);
        ExcelUtil<GovernanceAuditRow> util = new ExcelUtil<GovernanceAuditRow>(GovernanceAuditRow.class);
        util.exportExcel(response, list, "数据治理行结果数据");
    }

    /**
     * 获取数据治理行结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return AjaxResult.success(governanceAuditRowService.selectGovernanceAuditRowByRowId(rowId));
    }

    /**
     * 新增数据治理行结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:add')")
    @Log(title = "数据治理行结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GovernanceAuditRow governanceAuditRow)
    {
        return toAjax(governanceAuditRowService.insertGovernanceAuditRow(governanceAuditRow));
    }

    /**
     * 修改数据治理行结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:edit')")
    @Log(title = "数据治理行结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GovernanceAuditRow governanceAuditRow)
    {
        return toAjax(governanceAuditRowService.updateGovernanceAuditRow(governanceAuditRow));
    }

    /**
     * 删除数据治理行结果
     */
    @PreAuthorize("@ss.hasPermi('quality:governancerow:remove')")
    @Log(title = "数据治理行结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(governanceAuditRowService.deleteGovernanceAuditRowByRowIds(rowIds));
    }
}
