package com.huiquan.dao;

import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huiquan.entity.WeixinUser;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author huiquan
 * @since 2017-10-18
 */
public interface WeixinUserMapper extends BaseMapper<WeixinUser> {
	
	WeixinUser selectWeixinUserByOpenId(@Param("openid")String openId);

}