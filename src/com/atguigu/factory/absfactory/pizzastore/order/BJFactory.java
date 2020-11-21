package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJPepperPizza;

public class BJFactory implements AbsFactory  {

	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if( orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
