package com.atguigu.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(name + " 给奶酪披萨准备原材料。。。。");
	}
}
