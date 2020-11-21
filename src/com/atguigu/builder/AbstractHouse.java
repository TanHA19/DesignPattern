package com.atguigu.builder;

public abstract class AbstractHouse {
	public abstract void buildBacic();
	public abstract void buildWalls();
	public abstract void roofed();
	public void build() {
		buildBacic();
		buildWalls();
		roofed();
	}
}
