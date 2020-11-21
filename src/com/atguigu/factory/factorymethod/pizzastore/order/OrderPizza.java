package com.atguigu.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
	abstract Pizza createPizza (String orderType) ;
	public OrderPizza() {
		// TODO Auto-generated constructor stub
		Pizza pizza = null;
		String orderType = getType();
		pizza = createPizza(orderType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
  
	private String getType () {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("input pizza type :");
		    String str = strin.readLine();
		    return str;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new String();
	}
}
