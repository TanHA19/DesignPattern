package com.atguigu.composite;

public class Department extends OrganizationComponent {

	
	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("------------------"+super.getName()+"---------------");
	}
	

}
