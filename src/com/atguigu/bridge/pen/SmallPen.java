package com.atguigu.bridge.pen;

public class SmallPen extends Pen {

	public SmallPen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(String name) {
		// TODO Auto-generated method stub
		this.color.bepaint("SmallPen", name);
	}
	
}
