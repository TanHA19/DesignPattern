package com.atguigu.decorator;

public class Decorator extends Drink {
	private Drink obj ;
	public Decorator(Drink obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes() +":¼Û¸ñ" +super.getPrice() +" | "+obj.getDes() +" "+obj.getPrice();
	}
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice() + obj.cost();
	}
}
