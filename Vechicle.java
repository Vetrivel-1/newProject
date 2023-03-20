package com.oneoft.day17;

public class Vechicle {
	public String colour;
	public String brand;
	public int price;
	public int netPrice;
	public int Price;
	private int tax;
	
	public void  Settax(int netPrice) {
		this.netPrice=netPrice;
	}
	public int getNetPrice() {
		return netPrice;
	}
}

	