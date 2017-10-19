package com.huiquan.springboot.springtest;

public class Man extends Father {

	@Override
	protected void printSon() {
		System.out.println("printMan");
	}
	
	public static void main(String[] args) {
		Man man = new Man();
		man.printFather();
	}

}
