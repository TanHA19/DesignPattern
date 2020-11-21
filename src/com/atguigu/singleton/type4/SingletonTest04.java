package com.atguigu.singleton.type4;


public class SingletonTest04 {

}
/**
 * �̰߳�ȫ�� ����ʽ����ģʽ
 * @author ̷溽�
 *
 */
class Singleton {
	private static Singleton instance;
	
	private Singleton () {
		
		
	}
	
	// �ṩ��̬�Ĺ��з�����ʹ�ò�ȥ����
	public static synchronized Singleton getInstance () {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}