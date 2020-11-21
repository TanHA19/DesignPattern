package com.atguigu.singleton.type5;


public class SingletonTest05 {

}
/**
 * ˫�ؼ�� ����ʽ����ģʽ
 * @author ̷溽�
 *
 */
class Singleton {
	private static volatile Singleton instance;
	
	private Singleton () {
		
		
	}
	
	// �ṩ��̬�Ĺ��з�����ʹ�ò�ȥ����
	public static synchronized Singleton getInstance () {
		if (instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}