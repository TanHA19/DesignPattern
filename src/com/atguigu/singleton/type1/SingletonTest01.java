package com.atguigu.singleton.type1;

/**
 *  饿汉式 静态代码块
 * @author 谭婧杰
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
	// 静态代码块中创建单例对象
	static {
		instance = new Singleton();
	}
	public static Singleton getInstance () {
		return instance;
	}
}
