package com.atguigu.singleton.type6;


public class SingletonTest06 {

}
/**
 * 静态内部类实现单例模式
 * 采用了类加载机制来保证初始化实例时只有一个线程
 * 类的静态属性只会在第一次加载类的时候初始化，在这里JVM保证了
 * 线程的安全性
 * @author 谭婧杰
 *
 */
class Singleton {
	
	private Singleton () {}
	
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	// 提供静态的公有方法，使用才去创建
	public static synchronized Singleton getInstance () {
	
		return SingletonInstance.INSTANCE;
	}
}