package com.atguigu.decorator;

public class Client {
	public static void main(String[] args) {
		Espresso e = new Espresso();
		
		new Mikl(new Chocolate(e));
	}
}
