package com.atguigu.composite;

public class Client {
	public static void main(String[] args) {
		OrganizationComponent university = new University("清华大学", "一本学院" );
		College college = new College("计算机学院", "电子信息学院");
		Department department = new Department("软件工程系", "工程系");
		Department department2 = new Department("电子通信系", "工程系");
		
		college.add(department);
		college.add(department2);
		
		university.add(college);
		
		university.print();
		college.print();
	}
}
