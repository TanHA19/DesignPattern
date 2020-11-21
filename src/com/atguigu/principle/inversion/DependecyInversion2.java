package com.atguigu.principle.inversion;

public class DependecyInversion2 {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}
}
interface IReceive {
	String getInfo(); 
}
class Email1 implements IReceive {
	@Override
	public String getInfo () {
		return "�����ʼ���Ϣ��hello ,World";
	}
}
// ���Person������Ϣ�Ĺ���
// 1 �򵥣������뵽
// ����������ǻ�ȡ����΢�ţ����ŵ� ��Ҫ�¼���
// ���˼·�� ����һ������Ľӿ�IReceive��ʾ������
// ��ΪEmail,Weixin �����ڽ����߷�Χ ���Ǹ���ʵ��IReceiver�ӿھ�ok ������������
class Person1 {
	public void receive(IReceive iReceive) {
		System.out.println(iReceive.getInfo());
	}
}