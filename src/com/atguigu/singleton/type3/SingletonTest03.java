package com.atguigu.singleton.type3;


public class SingletonTest03 {

}
/**
 * �̲߳���ȫ�� ����ʽ����ģʽ
 * @author ̷溽�
 *
 */
class Singleton {
	private static Singleton instance;
	
	private Singleton () {
		
		
	}
	
	// �ṩ��̬�Ĺ��з�����ʹ�ò�ȥ����
	public static Singleton getInstance () {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}