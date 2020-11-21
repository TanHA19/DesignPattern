package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("普通房子打地基");
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("普通房子打砌墙");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("普通房子打封顶");
	}

}
