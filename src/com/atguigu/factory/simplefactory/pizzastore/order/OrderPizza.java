package com.atguigu.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	private SimpleFactory simpleFactory;
	Pizza pizza = null;

	public void setSimpleFactory(SimpleFactory simpleFactory) {
		String orderType= "";
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
		    if(pizza != null) {
		    	 pizza.prepare();
				 pizza.bake();
				 pizza.cut();
				 pizza.box();
				    
		    } else {
		    	System.out.println("¶©¹ºÅûÈøÊ§°Ü");
		    	break;
		    }
		} while (true);
	}

	public OrderPizza(SimpleFactory simpleFactory) {
		setSimpleFactory(simpleFactory);
	}

	private String getType () {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println(" input pizza type :");
		    String str = strin.readLine();
		    return str;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new String();
	}
}
