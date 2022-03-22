package com.ruoyi.project.quality.domain;

import lombok.Data;

/**
 * @author cai
 * @date 2022/3/22 14:38
 */
@Data
public class DolphinApiResult {

    private Integer code;
    private Object data;
    private Boolean failed;
    private String msg;
    private Boolean success;

}
