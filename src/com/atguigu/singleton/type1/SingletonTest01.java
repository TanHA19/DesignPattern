package com.atguigu.singleton.type1;

/**
 *  ����ʽ ��̬�����
 * @author ̷溽�
 *
 */
public class SingletonTest01 {
	public static void main(String[] args) {
		
	}
}


class Singleton {
	
	private  static Singleton instance ;
	private Singleton () {
		 
	}
	// ��̬������д�����������
	static {
		instance = new Singleton();
	}
	public static Singleton getInstance () {
		return instance;
	}
}
