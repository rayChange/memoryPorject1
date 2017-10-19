package com.huiquan.result;

/**
 * 业务状态码
 */
public enum ResultDataEnum {
    OK(10000,"OK"),
    PARAMS_ERROR(10001,"参数异常");
	
	

	/**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultDataEnum(int code, String message) {
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
    
    public static ResultDataEnum getEnu(String name){
    	for(ResultDataEnum enu :ResultDataEnum.values()){
    		if(enu.name().equals(name)){
    			return enu;
    		}
    	}
    	return null;
    }
    
    public static boolean isOk(ResultDataEnum resultDataEnum){
    	if(resultDataEnum.getCode() == 10000){
    		return true;
    	} 
    	return false;
    }
}
