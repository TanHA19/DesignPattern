package com.atguigu.singleton.type2;

/**
 *  饿汉式 （静态变量）
 * @author 谭婧杰
 *
 */
public class SingletonTest02 {
	public static void main(String[] args) {

	}
}


// 写法简单 ，在类装载的时候完成实例化 避免线程同步 
// 没有懒加载的效果
class Singleton {

	private Singleton() {

	}

	// 内部创建对象实例
	private final static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
}
