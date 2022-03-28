package com.ruoyi.project.quality.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.quality.domain.GovernanceProjectBlackList;
import com.ruoyi.project.quality.service.IGovernanceProjectBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试数据黑名单Controller
 *
 * @author cai
 * @date 2022-03-24
 */
@RestController
@RequestMapping("/quality/blacklist")
public class GovernanceProjectBlackListController extends BaseController {

    private static ExecutorService FIXED_THREAD_POOL;

    static {
        FIXED_THREAD_POOL = Executors.newFixedThreadPool(4);
    }

    @Autowired
    private IGovernanceProjectBlackListService governanceProjectBlackListService;

    /**
     * 查询测试数据黑名单列表
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:list')")
    @GetMapping("/list")
    public TableDataInfo list(GovernanceProjectBlackList governanceProjectBlackList) {
        startPage();
        List<GovernanceProjectBlackList> list = governanceProjectBlackListService.selectGovernanceProjectBlackListList(governanceProjectBlackList);
        return getDataTable(list);
    }

    /**
     * 导出测试数据黑名单列表
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:export')")
    @Log(title = "测试数据黑名单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GovernanceProjectBlackList governanceProjectBlackList) {
        List<GovernanceProjectBlackList> list = governanceProjectBlackListService.selectGovernanceProjectBlackListList(governanceProjectBlackList);
        ExcelUtil<GovernanceProjectBlackList> util = new ExcelUtil<GovernanceProjectBlackList>(GovernanceProjectBlackList.class);
        util.exportExcel(response, list, "测试数据黑名单数据");
    }

    @Log(title = "测试数据黑名单", businessType = BusinessType.IMPORT)
    @PreAuthorize("@ss.hasPermi('quality:blacklist:import')")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception {
        ExcelUtil<GovernanceProjectBlackList> util = new ExcelUtil<>(GovernanceProjectBlackList.class);
        List<GovernanceProjectBlackList> list = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = governanceProjectBlackListService.importList(list, updateSupport, operName);
        return AjaxResult.success(message);
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response) {
        ExcelUtil<GovernanceProjectBlackList> util = new ExcelUtil<>(GovernanceProjectBlackList.class);
        util.importTemplateExcel(response, "屏蔽测试数据");
    }

    /**
     * 获取测试数据黑名单详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(governanceProjectBlackListService.selectGovernanceProjectBlackListById(id));
    }

    /**
     * 新增测试数据黑名单
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:add')")
    @Log(title = "测试数据黑名单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GovernanceProjectBlackList governanceProjectBlackList) {
        return toAjax(governanceProjectBlackListService.insertGovernanceProjectBlackList(governanceProjectBlackList));
    }

    /**
     * 修改测试数据黑名单
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:edit')")
    @Log(title = "测试数据黑名单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GovernanceProjectBlackList governanceProjectBlackList) {
        return toAjax(governanceProjectBlackListService.updateGovernanceProjectBlackList(governanceProjectBlackList));
    }

    @PreAuthorize("@ss.hasPermi('quality:blacklist:edit')")
    @Log(title = "测试数据黑名单", businessType = BusinessType.OTHER)
    @PutMapping(value = "/exclude")
    public AjaxResult exclude() {
        FIXED_THREAD_POOL.execute(new Runnable() {
            @Override
            public void run() {
                governanceProjectBlackListService.excludeGovernanceProjectBlackList();
            }
        });
        return toAjax(1);
    }

    /**
     * 删除测试数据黑名单
     */
    @PreAuthorize("@ss.hasPermi('quality:blacklist:remove')")
    @Log(title = "测试数据黑名单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(governanceProjectBlackListService.deleteGovernanceProjectBlackListByIds(ids));
    }
}
