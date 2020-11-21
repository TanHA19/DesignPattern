package com.atguigu.singleton.type3;


public class SingletonTest03 {

}
/**
 * 线程不安全的 懒汉式单例模式
 * @author 谭婧杰
 *
 */
class Singleton {
	private static Singleton instance;
	
	private Singleton () {
		
		
	}
	
	// 提供静态的公有方法，使用才去创建
	public static Singleton getInstance () {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}