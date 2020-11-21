package com.atguigu.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(name + " 给准备原材料。。。。");
	}
	
}
