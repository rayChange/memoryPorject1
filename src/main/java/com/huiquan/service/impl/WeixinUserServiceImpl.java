package com.huiquan.service.impl;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.feilong.core.Validator;
import com.huiquan.dao.WeixinUserMapper;
import com.huiquan.entity.WeixinUser;
import com.huiquan.service.IWeixinUserService;
import com.huiquan.util.HttpUtils;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huiquan
 * @since 2017-10-18
 */
@Service
public class WeixinUserServiceImpl extends ServiceImpl<WeixinUserMapper, WeixinUser> implements IWeixinUserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private WeixinUserMapper weixinUserMapper;
	
	
	
	@Override
	public WeixinUser loginWeixinUser(WeixinUser user,String code) {
		String openId = getOpenIdByCode(code);
		logger.info("=================code:{}========================",code);
		logger.info("=================openId:{}========================",openId);
		if(Validator.isNullOrEmpty(openId)){
			return new WeixinUser();
		}
		if(Validator.isNullOrEmpty(weixinUserMapper.selectWeixinUserByOpenId(openId))){
			user.setOpenid(openId);
			weixinUserMapper.insert(user);
		}else{
			user = weixinUserMapper.selectWeixinUserByOpenId(openId);
		}
		return user;
	}
	
	public String getOpenIdByCode(String code){
		String openId = "";
		String weiResultString = HttpUtils.sendGet("https://api.weixin.qq.com/sns/jscode2session?appid=wxd517d975c1b8852c&secret=a657fb801cb0e7644b890b66afea9be8&js_code="+code);
		Map<String,Object> resultMap = (Map<String,Object>)JSON.parse(weiResultString);
		if(Validator.isNotNullOrEmpty(resultMap) && Validator.isNotNullOrEmpty(resultMap.get("openid"))){
			openId = resultMap.get("openid").toString();
		}
		return openId;
	}
	
}
