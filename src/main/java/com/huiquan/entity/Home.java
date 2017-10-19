package com.huiquan.entity;

import java.io.Serializable;

public class Home implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String address;
	
	private String name;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
