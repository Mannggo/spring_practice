package com.zhongd.eureka_client.entity;

import java.util.Objects;

/**
 * @author xiezd 2018-05-05 10:14
 */
public class ReturnObject {
    private Long code;
    private String description;
    private Object data;

    public Long getCode() {
        if(Objects.isNull(code)) {
            return ReturnCode.SUCCESS.getCode();
        }
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        if(Objects.isNull(description)) {
            return ReturnCode.SUCCESS.getMessage();
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
