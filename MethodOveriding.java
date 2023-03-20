package com.oneoft.day17;

public class MethodOveriding {
	public int add(int a,int b) {
		return a+b;
	}

	public int multiply(int a,int b,int c) {
		return a*b*c;
	}
	public int add(String a,String b) {
		return a.length()+b.length();
	}
	public int divide(int a,int b) {
		return a/b;
	}
	
}
