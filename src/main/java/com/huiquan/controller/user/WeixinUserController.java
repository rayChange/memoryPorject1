package com.huiquan.controller.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feilong.core.bean.BeanUtil;
import com.huiquan.controller.base.BaseController;
import com.huiquan.dao.StudentMapper;
import com.huiquan.entity.MemoryRecord;
import com.huiquan.entity.WeixinUser;
import com.huiquan.result.ResultModel;
import com.huiquan.service.IMemoryRecordService;
import com.huiquan.service.IStudentService;
import com.huiquan.service.IWeixinUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("user")
public class WeixinUserController extends BaseController {
	
	@Autowired IWeixinUserService weixinUserService;
	
	@PostMapping("/insertWinxinUser")
	public ResultModel insertStudent(@RequestBody Map<String,Object> param){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("param", param);
		WeixinUser user = new WeixinUser();
		if(null != param && null != param.get("code") && null != param.get("nickName")){
			BeanUtil.copyProperties(user, param,"nickName","avatarUrl","gender","city","province","country");
			user.setTsp(new Date());
			String code = param.get("code").toString();
			user = weixinUserService.loginWeixinUser(user, code);
		}
		return success(user);
	}
	
}
