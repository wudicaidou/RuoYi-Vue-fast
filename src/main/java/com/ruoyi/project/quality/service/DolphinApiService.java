package com.ruoyi.project.quality.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.project.quality.domain.DolphinApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author cai
 * @date 2022/3/22 13:56
 */
@Service
public class DolphinApiService {

    private final static String DOLPHIN_API = "http://cdh-0000:12345";

    @Autowired
    private RestTemplate restTemplate;

    public DolphinApiResult startProcessInstance(String processCode, JSONObject params) {

        String projectCode = "4775414789216";
        String url = "/dolphinscheduler/projects/{projectCode}/executors/start-process-instance";
        url = url.replace("{projectCode}", projectCode);

        MultiValueMap<String, String> object = new LinkedMultiValueMap<>();
        object.add("processDefinitionCode", processCode);
        object.add("failureStrategy", "END");
        object.add("processInstancePriority", "MEDIUM");
        object.add("scheduleTime", "");
        object.add("warningGroupId", "0");
        object.add("warningType", "NONE");
        object.add("taskDependType", "TASK_POST");
        object.add("runMode", "RUN_MODE_SERIAL");
        object.add("workerGroup", "default");
        object.add("dryRun", "0");
        object.add("startParams", params.toJSONString());

        DolphinApiResult result = postDolphinApi(url, object);
        return result;
    }

    private DolphinApiResult postDolphinApi(String url, MultiValueMap<String, String> params) {
        MultiValueMap<String, String> headers = getHeaders();
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        ResponseEntity<String> response = restTemplate.exchange(DOLPHIN_API + url, HttpMethod.POST, requestEntity, String.class);
        return parseApiResult(response.getBody());
    }

    private DolphinApiResult parseApiResult(String json) {
        return JSON.parseObject(json, DolphinApiResult.class);
    }

    private MultiValueMap<String, String> getHeaders() {
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Accept", "application/json, text/json");
        headers.add("Content-Type", "application/x-www-form-urlencoded");
        headers.add("token", "57c5ff64f3af69ef43fbd800a938c3f0");
        return headers;
    }

}
