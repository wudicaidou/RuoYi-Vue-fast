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
import com.ruoyi.project.quality.domain.ComprehensiveDetailDaily;
import com.ruoyi.project.quality.service.IComprehensiveDetailDailyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 全面性问题关闭Controller
 *
 * @author cai
 * @date 2022-04-25
 */
@RestController
@RequestMapping("/quality/compre")
public class ComprehensiveDetailDailyController extends BaseController {
    @Autowired
    private IComprehensiveDetailDailyService comprehensiveDetailDailyService;

    /**
     * 查询全面性问题关闭列表
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:list')")
    @GetMapping("/list")
    public TableDataInfo list(ComprehensiveDetailDaily comprehensiveDetailDaily) {
        startPage();
        List<ComprehensiveDetailDaily> list = comprehensiveDetailDailyService.selectComprehensiveDetailDailyList(comprehensiveDetailDaily);
        return getDataTable(list);
    }

    /**
     * 导出全面性问题关闭列表
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:export')")
    @Log(title = "全面性问题关闭", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ComprehensiveDetailDaily comprehensiveDetailDaily) {
        List<ComprehensiveDetailDaily> list = comprehensiveDetailDailyService.selectComprehensiveDetailDailyList(comprehensiveDetailDaily);
        ExcelUtil<ComprehensiveDetailDaily> util = new ExcelUtil<ComprehensiveDetailDaily>(ComprehensiveDetailDaily.class);
        util.exportExcel(response, list, "全面性问题关闭数据");
    }

    /**
     * 获取全面性问题关闭详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(comprehensiveDetailDailyService.selectComprehensiveDetailDailyById(id));
    }

    /**
     * 新增全面性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:add')")
    @Log(title = "全面性问题关闭", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ComprehensiveDetailDaily comprehensiveDetailDaily) {
        return toAjax(comprehensiveDetailDailyService.insertComprehensiveDetailDaily(comprehensiveDetailDaily));
    }

    /**
     * 修改全面性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:edit')")
    @Log(title = "全面性问题关闭", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ComprehensiveDetailDaily comprehensiveDetailDaily) {
        return toAjax(comprehensiveDetailDailyService.updateComprehensiveDetailDaily(comprehensiveDetailDaily));
    }

    /**
     * 修改全面性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:close')")
    @Log(title = "全面性问题关闭", businessType = BusinessType.UPDATE)
    @PutMapping(value = "/as-close")
    public AjaxResult close(@RequestBody CloseProblemVO vo) {
        return toAjax(comprehensiveDetailDailyService.closeComprehensiveDetailDailyByIds(vo.getIds()));
    }

    /**
     * 删除全面性问题关闭
     */
    @PreAuthorize("@ss.hasPermi('quality:compre:remove')")
    @Log(title = "全面性问题关闭", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(comprehensiveDetailDailyService.deleteComprehensiveDetailDailyByIds(ids));
    }
}
