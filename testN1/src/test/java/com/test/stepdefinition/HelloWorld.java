package com.test.stepdefinition;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld o= new HelloWorld();
		int s=o.sum(3, 6);
		System.out.println(s);

	}
	
	public int sum(int a, int b){
		return a+b;
	}

}
