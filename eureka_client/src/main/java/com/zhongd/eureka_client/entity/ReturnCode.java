package com.zhongd.eureka_client.entity;

/**
 * @author xiezd 2018-05-05 10:17
 */
public enum ReturnCode {
    SUCCESS(1, "成功"), FAIL(0, "服务器出错"), PARAMETER_ERROR(2, "参数错误");
    private String message;
    private Long code;
    ReturnCode(long code, String message){
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
