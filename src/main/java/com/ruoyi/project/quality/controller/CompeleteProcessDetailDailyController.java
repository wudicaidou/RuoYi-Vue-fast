package com.ruoyi.project.quality.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.project.quality.domain.CloseProblemVO;
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
import com.ruoyi.project.quality.domain.CompeleteProcessDetailDaily;
import com.ruoyi.project.quality.service.ICompeleteProcessDetailDailyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 业务流程完整性问题修复Controller
 *
 * @author cai
 * @date 2022-04-25
 */
@RestController
@RequestMapping("/quality/process")
public class CompeleteProcessDetailDailyController extends BaseController {
    @Autowired
    private ICompeleteProcessDetailDailyService compeleteProcessDetailDailyService;

    /**
     * 查询业务流程完整性问题修复列表
     */
    @PreAuthorize("@ss.hasPermi('quality:process:list')")
    @GetMapping("/list")
    public TableDataInfo list(CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        startPage();
        List<CompeleteProcessDetailDaily> list = compeleteProcessDetailDailyService.selectCompeleteProcessDetailDailyList(compeleteProcessDetailDaily);
        return getDataTable(list);
    }

    /**
     * 导出业务流程完整性问题修复列表
     */
    @PreAuthorize("@ss.hasPermi('quality:process:export')")
    @Log(title = "业务流程完整性问题修复", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        List<CompeleteProcessDetailDaily> list = compeleteProcessDetailDailyService.selectCompeleteProcessDetailDailyList(compeleteProcessDetailDaily);
        ExcelUtil<CompeleteProcessDetailDaily> util = new ExcelUtil<CompeleteProcessDetailDaily>(CompeleteProcessDetailDaily.class);
        util.exportExcel(response, list, "业务流程完整性问题修复数据");
    }

    /**
     * 获取业务流程完整性问题修复详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:process:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(compeleteProcessDetailDailyService.selectCompeleteProcessDetailDailyById(id));
    }

    /**
     * 新增业务流程完整性问题修复
     */
    @PreAuthorize("@ss.hasPermi('quality:process:add')")
    @Log(title = "业务流程完整性问题修复", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        return toAjax(compeleteProcessDetailDailyService.insertCompeleteProcessDetailDaily(compeleteProcessDetailDaily));
    }

    /**
     * 修改业务流程完整性问题修复
     */
    @PreAuthorize("@ss.hasPermi('quality:process:edit')")
    @Log(title = "业务流程完整性问题修复", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        return toAjax(compeleteProcessDetailDailyService.updateCompeleteProcessDetailDaily(compeleteProcessDetailDaily));
    }

    /**
     * 关闭业务流程完整性问题
     */
    @PreAuthorize("@ss.hasPermi('quality:process:close')")
    @Log(title = "业务流程完整性问题修复", businessType = BusinessType.UPDATE)
    @PutMapping(value = "/as-close")
    public AjaxResult close(@RequestBody CloseProblemVO vo) {
        return toAjax(compeleteProcessDetailDailyService.closeCompeleteProcessDetailDailyByIds(vo.getIds()));
    }

    /**
     * 删除业务流程完整性问题修复
     */
    @PreAuthorize("@ss.hasPermi('quality:process:remove')")
    @Log(title = "业务流程完整性问题修复", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(compeleteProcessDetailDailyService.deleteCompeleteProcessDetailDailyByIds(ids));
    }
}
