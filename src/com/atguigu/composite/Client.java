package com.atguigu.composite;

public class Client {
	public static void main(String[] args) {
		OrganizationComponent university = new University("�廪��ѧ", "һ��ѧԺ" );
		College college = new College("�����ѧԺ", "������ϢѧԺ");
		Department department = new Department("�������ϵ", "����ϵ");
		Department department2 = new Department("����ͨ��ϵ", "����ϵ");
		
		college.add(department);
		college.add(department2);
		
		university.add(college);
		
		university.print();
		college.print();
	}
}
