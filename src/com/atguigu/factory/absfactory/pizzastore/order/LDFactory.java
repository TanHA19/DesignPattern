package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;



public class LDFactory implements AbsFactory{
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if( orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
