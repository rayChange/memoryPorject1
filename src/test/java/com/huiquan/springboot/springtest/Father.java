package com.huiquan.springboot.springtest;

import io.swagger.models.auth.In;

public abstract class Father {
	
	void printFather(){
		System.out.println("printFather");
		printSon();
	}
	
	protected abstract void printSon();
	
	public static void main(String[] args) {
		Integer i = Integer.valueOf(1);
		Integer j = Integer.valueOf(3);
		if(i == j){
			System.out.println(true);
		}
		System.out.println(false);
	}

}
