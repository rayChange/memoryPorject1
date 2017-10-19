package com.huiquan.controller.base;

import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.huiquan.result.ResultData;
import com.huiquan.result.ResultDataEnum;
import com.huiquan.result.ResultModel;
import com.huiquan.result.ResultModelEnum;

public class BaseController {
	
	/**
	 * （content里面空数据）
	 * 格式 {"ret":200,"milliUse":520,"message":"OK","content":{"code":0,"msg":"","info":""}}
	 * @param object 返回的数据  
	 * @return
	 */
	public ResultModel success(){
		return ResultModel.ok(new ResultData(ResultDataEnum.OK));
	}
	
	
	/**
	 * （content里面code和msg有数据）
	 * 格式 {"ret":200,"milliUse":520,"message":"OK","content":{"code":10000,"msg":"ok","info":""}}
	 * @param object 返回的数据
	 * @return
	 */
	public ResultModel success(ResultDataEnum resultDataEnum){
		return ResultModel.ok(new ResultData(resultDataEnum));
	}
	
	/**
	 * （content里面code和msg和info都有数据）(code默认是 10000)
	 * 格式 {"ret":200,"milliUse":520,"message":"OK","content":{"code":10000,"msg":"ok","info":"{"userId","3"}"}}
	 * @param object 返回的数据
	 * @return
	 */
	public ResultModel success(Object object){
		if(object instanceof Page){
			Page<?> page = (Page<?>)object;
			Map<String,Object> map = page.getCondition();
	    	map.put("records", page.getRecords());
	    	map.put("total", page.getTotal());
	    	map.put("size", page.getSize());
	    	map.put("current", page.getCurrent());
	    	return ResultModel.ok(new ResultData(ResultDataEnum.OK.getCode(),ResultDataEnum.OK.getMessage(),map));
		}
		return ResultModel.ok(new ResultData(ResultDataEnum.OK.getCode(),ResultDataEnum.OK.getMessage(),object));
	}
	

	/**
	 * （content里面code和msg和info都是自定义）
	 * 格式 {"ret":200,"milliUse":520,"message":"OK","content":{"code":10000,"msg":"ok","info":"{"userId","3"}"}}
	 * @param object 返回的数据
	 * @return
	 */
	public ResultModel success(int code,String msg,Object object){
		return ResultModel.ok(new ResultData(code,msg,object));
	}
	
	/**
	 * 错误返回
	 * @return
	 */
	public ResultModel error(){
		return ResultModel.error(ResultModelEnum.FAILURE);
	}
	
	/**
	 * 封装page返回
	 * @param map
	 * @param page
	 */
	public  void wrapPageMap(Map<String,Object> map,Page<Map<String, Object>> page){
		map.put("records", page.getRecords());
    	map.put("total", page.getTotal());
    	map.put("size", page.getSize());
    	map.put("current", page.getCurrent());
	}
	
	
}
