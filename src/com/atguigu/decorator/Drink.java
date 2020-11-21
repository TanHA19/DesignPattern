package com.atguigu.decorator;

public abstract class Drink {
	public String des; // √Ë ˆ
	private float price = 0.0f;
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	// º∆À„∑—”√
	public abstract float cost();
}
