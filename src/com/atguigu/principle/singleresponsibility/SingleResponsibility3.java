package com.atguigu.principle.singleresponsibility;

/**
 * ��һְ��
 * ������ĸ��Ӷȣ�һ����ֻ����һ��ְ��
 * �����Ŀɶ��ԣ���ά����
 * ���ͱ�������ķ���
 * ͨ������£�����Ӧ���ص�һְ��ԭ��ֻ���߼��㹻�򵥣��ſ����ڴ��뼶Υ����һְ��ԭ��
 * ��ֻ�����з��������㹻�٣������ڷ������𱣳ֵ�һְ��ԭ��
 * 
 * @author tan
 *
 */
public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("����");
		vehicle2.runAir("�ɻ�");
	}
	
}
// ����3 û�ж�ԭ������������޸ģ�ֻ�������޸�
//��Ȼû�����༶�����ص�һְ��ԭ�򣬵����ڷ��������ص�һְ��ԭ��
class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle+ " �ڹ�·������ ������������");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+ " ����������� ������������");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+ " ��ˮ������ ������������");
	}
}
