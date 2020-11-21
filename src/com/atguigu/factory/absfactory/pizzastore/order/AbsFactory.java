package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

public abstract interface AbsFactory {
	public Pizza createPizza(String orderType);
}
