package com.atguigu.builder.improve;

public class Client {
	public static void main(String[] args) {
		
		HouseDirector houseDirector = new HouseDirector(new CommonHouse());
		House createHouser = houseDirector.createHouser();
		
	}
}
