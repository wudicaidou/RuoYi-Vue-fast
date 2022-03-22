package com.ruoyi.project.quality.controller;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.quality.domain.ComprehensiveReRunVO;
import com.ruoyi.project.quality.domain.DolphinApiResult;
import com.ruoyi.project.quality.service.DolphinApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全面性
 *
 * @author cai
 * @date 2022/3/22 11:18
 */
@RestController
@RequestMapping("/quality/comprehensive")
public class ComprehensiveController extends BaseController {

    @Autowired
    private DolphinApiService dolphinApiService;

    @PreAuthorize("@ss.hasPermi('quality:comprehensive:rerun')")
    @Log(title = "全面性数据重跑", businessType = BusinessType.OTHER)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody ComprehensiveReRunVO reRunVO) {
        System.out.println(reRunVO);
        JSONObject params = new JSONObject();
        params.put("global_start_day", reRunVO.getStartDate());
        params.put("global_end_day", reRunVO.getEndDate());
        DolphinApiResult result = dolphinApiService.startProcessInstance("4782233572576", params);
        if (result.getSuccess()) {
            return AjaxResult.success();
        } else {
            return AjaxResult.error(result.getMsg());
        }
    }


}
