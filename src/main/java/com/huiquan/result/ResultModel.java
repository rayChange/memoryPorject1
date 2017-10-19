package com.huiquan.result;



/**
 * 自定义返回结果
 */
public class ResultModel {

    /**
     * 返回码
     */
    private int ret;

    /**
     * 返回结果描述
     */
    private String message;

    /**
     * 返回内容
     */
    private Object data;
    
    private long milliUse;//请求耗时

    public int getRet() {
        return ret;
    }

    public String getMessage() {
        return message;
    }

    public Object getContent() {
        return data;
    }

    public ResultModel(int ret, String message) {
        this.ret = ret;
        this.message = message;
        this.data = "";
    }

    public ResultModel(int ret, String message, Object data) {
        this.ret = ret;
        this.message = message;
        this.data = data;
    }

    public ResultModel(ResultModelEnum status) {
        this.ret = status.getCode();
        this.message = status.getMessage();
        this.data = "";
    }

    public ResultModel(ResultModelEnum status, Object data) {
        this.ret = status.getCode();
        this.message = status.getMessage();
        this.data = data;
    }

    public static ResultModel ok(Object data) {
        return new ResultModel(ResultModelEnum.SUCCESS, data);
    }

    public static ResultModel ok() {
        return new ResultModel(ResultModelEnum.SUCCESS);
    }

    public static ResultModel error(ResultModelEnum error) {
        return new ResultModel(error);
    }

	public long getMilliUse() {
		return milliUse;
	}

	public void setMilliUse(long milliUse) {
		this.milliUse = milliUse;
	}
}
