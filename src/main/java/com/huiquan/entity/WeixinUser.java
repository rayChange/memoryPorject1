package com.huiquan.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huiquan
 * @since 2017-10-18
 */
@TableName("weixin_user")
public class WeixinUser extends Model<WeixinUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户名称
     */
	private String nickName;
    /**
     * 用户头像
     */
	private String avatarUrl;
    /**
     * 用户性别
     */
	private Integer gender;
    /**
     * 城市
     */
	private String city;
    /**
     * 省份
     */
	private String province;
    /**
     * 国家
     */
	private String country;
    /**
     * 最高记忆位数
     */
	private Integer maxMemoryNum;
    /**
     * 创建时间
     */
	private Date tsp;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getMaxMemoryNum() {
		return maxMemoryNum;
	}

	public void setMaxMemoryNum(Integer maxMemoryNum) {
		this.maxMemoryNum = maxMemoryNum;
	}

	public Date getTsp() {
		return tsp;
	}

	public void setTsp(Date tsp) {
		this.tsp = tsp;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
