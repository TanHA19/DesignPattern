package com.atguigu.principle.inversion;

/**
 * ������ϵ���ݵ����ַ�ʽ
 * �ӿڴ���
 * ���췽������
 * setter��ʽ����
 * 
 * �ײ�ģ�龡����Ҫ�г������ӿڣ��������߶��У������ȶ�����
 * �������������;����ǳ������ӿڣ��������ǵı������ú�ʵ�ʶ���䣬�ʹ���һ������
 * �㣬���ó�����չ���Ż�
 * �̳�ʱ��ѭ�����滻ԭ��
 * @author tan
 *
 */
public class DependecyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}
}
class Email {
	public String getInfo () {
		return "�����ʼ���Ϣ��hello ,World";
	}
}
// ���Person������Ϣ�Ĺ���
// 1 �򵥣������뵽
// ����������ǻ�ȡ����΢�ţ����ŵ� ��Ҫ�¼���
// ���˼·�� ����һ������Ľӿ�IReceive��ʾ������
// ��ΪEmail,Weixin �����ڽ����߷�Χ ���Ǹ���ʵ��IReceiver�ӿھ�ok ������������
class Person {
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}