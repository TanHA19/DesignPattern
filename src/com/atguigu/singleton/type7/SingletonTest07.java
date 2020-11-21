package com.atguigu.singleton.type7;


/**
 * ö��ʵ�ֵ��� ��ֹ�����л����´���ʹ��
 * @author ̷溽�
 *
 */
public class SingletonTest07 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		instance.sayOk();
	}
}

enum Singleton {
	INSTANCE; 
	public void sayOk () {
		System.out.print("ok ~");
	}
} 