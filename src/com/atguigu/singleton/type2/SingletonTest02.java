package com.atguigu.singleton.type2;

/**
 *  ����ʽ ����̬������
 * @author ̷溽�
 *
 */
public class SingletonTest02 {
	public static void main(String[] args) {

	}
}


// д���� ������װ�ص�ʱ�����ʵ���� �����߳�ͬ�� 
// û�������ص�Ч��
class Singleton {

	private Singleton() {

	}

	// �ڲ���������ʵ��
	private final static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
}
