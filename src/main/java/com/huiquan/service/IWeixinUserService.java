package com.huiquan.service;


import com.baomidou.mybatisplus.service.IService;
import com.huiquan.entity.WeixinUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huiquan
 * @since 2017-10-18
 */
public interface IWeixinUserService extends IService<WeixinUser> {
	
	/**
	 * 记录用户
	 */
	WeixinUser loginWeixinUser(WeixinUser user,String code);
	
}
