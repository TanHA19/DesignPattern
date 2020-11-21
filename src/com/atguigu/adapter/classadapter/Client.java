package com.atguigu.adapter.classadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("ÀàÊÊÅäÆ÷Ä£Ê½");
		Phone p = new Phone();
		p.charging(new VoltageAdapter());
	}
}
