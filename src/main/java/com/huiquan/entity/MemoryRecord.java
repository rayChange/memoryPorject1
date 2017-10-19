package com.huiquan.entity;

import java.util.Date;
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
@TableName("memory_record")
public class MemoryRecord extends Model<MemoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 记录ID
     */
	private Integer id;
    /**
     * 用户ID
     */
	private Integer userId;
    /**
     * 是否成功
     */
	private Integer isSuccess;
    /**
     * 随机数值
     */
	private String randomNum;
    /**
     * 用户输入数值
     */
	private String inputNum;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Integer isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(String randomNum) {
		this.randomNum = randomNum;
	}

	public String getInputNum() {
		return inputNum;
	}

	public void setInputNum(String inputNum) {
		this.inputNum = inputNum;
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
