package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility1 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("Ħ�г�");
	}
}
// ��ͨ������
// ��ʽ1
// 1 �ڷ�ʽ1��run�����У�Υ���˵�һְ��ԭ��
// 2 ����������ݽ�ͨ�������з�����ͬ���ֽ�ɲ�ͬ����
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle+ " �ڹ�·������ ������������");
	}
}