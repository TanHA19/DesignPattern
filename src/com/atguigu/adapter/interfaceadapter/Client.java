package com.atguigu.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		new AbsAdapter() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("สนำรมหm1");
			}
		};
	}
}
