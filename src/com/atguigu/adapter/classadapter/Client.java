package com.atguigu.adapter.classadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("��������ģʽ");
		Phone p = new Phone();
		p.charging(new VoltageAdapter());
	}
}
