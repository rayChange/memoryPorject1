package com.huiquan.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huiquan.dao.WeixinUserMapper;
import com.huiquan.entity.WeixinUser;
import com.huiquan.service.IWeixinUserService;

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

	@Autowired
	private WeixinUserMapper weixinUserMapper;
	
	@Override
	public WeixinUser loginWeixinUser(WeixinUser user,String code) {
		weixinUserMapper.insert(user);
		return null;
	}
	
}
