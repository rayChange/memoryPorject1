package com.huiquan.result;



/**
 * 详细返回信息实体: 注意该实体不能直接返回 必须作为ResultModel的data参数
 */
public class ResultData {
	
	/**
     * 业务码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String msg;

    /**
     * 返回内容
     */
    private Object info;
    
    public  ResultData(Object info){
    	this.info = info;
    	this.code = 0;
    	this.msg = "";
    }
    
    public  ResultData(int code,Object info){
    	this.code = code;
    	this.info = info;
    	this.msg = "";
    }
    
    public  ResultData(int code,String msg,Object info){
    	this.code = code;
    	this.msg = msg;
    	this.info = info;
    }
    
    public ResultData(ResultDataEnum dataEnum){
    	this.code = dataEnum.getCode();
    	this.msg = dataEnum.getMessage();
    	this.info="";
    }

    public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

}
