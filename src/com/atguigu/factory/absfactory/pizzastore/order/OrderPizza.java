package com.atguigu.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	AbsFactory absFactory;
	public OrderPizza(AbsFactory absFactory) {
		// TODO Auto-generated constructor stub
		setAbsFactory(absFactory);
	}
	public void setAbsFactory(AbsFactory absFactory) {
		this.absFactory = absFactory;
		Pizza pizza = null;
		String orderType = getType();
		pizza = absFactory.createPizza(orderType);
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
