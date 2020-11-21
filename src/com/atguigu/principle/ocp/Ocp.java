package com.atguigu.principle.ocp;

public class Ocp {
	public static void main(String[] args) {
		
	}
	
}
abstract class Shape {
	int m_type;
	public abstract void draw();
}

class Rectangle extends Shape {

	public Rectangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制矩形");
	}
	
}

class Circle extends Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
		super.m_type = 2;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制圆形");
	}
	
}