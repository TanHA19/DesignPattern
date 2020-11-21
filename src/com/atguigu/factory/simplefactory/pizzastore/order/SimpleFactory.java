package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

// �򵥹�����
public class SimpleFactory {
	public Pizza createPizza (String orderType) {
		Pizza pizza = null;
		System.out.print("ʹ�ü򵥹���ģʽ");
		
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("ϣ������");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("��������");
		} 
		return pizza;
	}
}
