package com.atguigu.singleton.type7;


/**
 * 枚举实现单例 防止反序列化重新创建使用
 * @author 谭婧杰
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