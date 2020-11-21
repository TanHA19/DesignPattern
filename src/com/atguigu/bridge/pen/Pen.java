package com.atguigu.bridge.pen;

public abstract class Pen {
	protected Color color;
	public Pen(Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	public abstract void draw(String name);
}
