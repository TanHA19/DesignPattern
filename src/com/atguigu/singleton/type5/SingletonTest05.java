package com.atguigu.singleton.type5;


public class SingletonTest05 {

}
/**
 * 双重检查 懒汉式单例模式
 * @author 谭婧杰
 *
 */
class Singleton {
	private static volatile Singleton instance;
	
	private Singleton () {
		
		
	}
	
	// 提供静态的公有方法，使用才去创建
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