package com.huiquan.result;

/**
 * 自定义请求状态码
 */
public enum ResultModelEnum {
    SUCCESS(200, "OK"),
    FAILURE(201,"系统异常,请稍后再试"),
    USER_LOCK(440, "用户被冻结"),
    DUPLICATE_SUBMIT(450, "重复提交");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultModelEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
