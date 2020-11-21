package com.atguigu.singleton.type6;


public class SingletonTest06 {

}
/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * ����������ػ�������֤��ʼ��ʵ��ʱֻ��һ���߳�
 * ��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ����������JVM��֤��
 * �̵߳İ�ȫ��
 * @author ̷溽�
 *
 */
class Singleton {
	
	private Singleton () {}
	
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	// �ṩ��̬�Ĺ��з�����ʹ�ò�ȥ����
	public static synchronized Singleton getInstance () {
	
		return SingletonInstance.INSTANCE;
	}
}