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
import com.ruoyi.project.quality.domain.CompeleteMessageDetailDaily;
import com.ruoyi.project.quality.service.ICompeleteMessageDetailDailyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 公开信息完整性问题关闭Controller
 *
 * @author cai
 * @date 2022-04-25
 */
@RestController
@RequestMapping("/quality/message")
public class CompeleteMessageDetailDailyController extends BaseController {
    @Autowired
    private ICompeleteMessageDetailDailyService compeleteMessageDetailDailyService;

    /**
     * 查询公开信息完整性问题关闭列表
     */
    @PreAuthorize("@ss.hasPermi('quality:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        startPage();
        List<CompeleteMessageDetailDaily> list = compeleteMessageDetailDailyService.selectCompeleteMessageDetailDailyList(compeleteMessageDetailDaily);
        return getDataTable(list);
    }

    /**
     * 导出公开信息完整性问题关闭列表
     */
    @PreAuthorize("@ss.hasPermi('quality:message:export')")
    @Log(title = "公开信息完整性问题关闭", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        List<CompeleteMessageDetailDaily> list = compeleteMessageDetailDailyService.selectCompeleteMessageDetailDailyList(compeleteMessageDetailDaily);
        ExcelUtil<CompeleteMessageDetailDaily> util = new ExcelUtil<CompeleteMessageDetailDaily>(CompeleteMessageDetailDaily.class);
        util.exportExcel(response, list, "公开信息完整性问题关闭数据");
    }

    /**
     * 获取公开信息完整性问题关闭详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:message:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(compeleteMessageDetailDailyService.selectCompeleteMessageDetailDailyById(id));
    }

    /**
     * 新增公开信息完整性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:message:add')")
    @Log(title = "公开信息完整性问题关闭", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        return toAjax(compeleteMessageDetailDailyService.insertCompeleteMessageDetailDaily(compeleteMessageDetailDaily));
    }

    /**
     * 修改公开信息完整性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:message:edit')")
    @Log(title = "公开信息完整性问题关闭", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        return toAjax(compeleteMessageDetailDailyService.updateCompeleteMessageDetailDaily(compeleteMessageDetailDaily));
    }

    /**
     * 删除公开信息完整性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:message:remove')")
    @Log(title = "公开信息完整性问题关闭", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(compeleteMessageDetailDailyService.deleteCompeleteMessageDetailDailyByIds(ids));
    }
}
