package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {
	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("Ħ�г�");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("�ɻ�");
	}
}
// ����2 
// 1 ���ص�һְ��ԭ��
// 2 �����������ĸĶ��ܴ󣬼�����ֽ⣬ͬʱ�޸Ŀͻ���
// �Ľ� ֱ���޸�Vehicle
class RoadVehicle {
	public void run (String vehicle) {
		System.out.println(vehicle + " �ڹ�·������ ");
	}
}
class AirVehicle {
	public void run (String vehicle) {
		System.out.println(vehicle + " ���������� ");
	}
}