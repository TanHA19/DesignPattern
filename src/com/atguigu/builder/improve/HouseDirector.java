package com.atguigu.builder.improve;

public class HouseDirector {
	HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		 
		this.houseBuilder = houseBuilder;
	}
	public House createHouser() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
}
