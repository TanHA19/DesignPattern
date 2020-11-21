package com.atguigu.prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep = new Sheep("tom",1,"°×É«");
		for (int i = 0; i < 10; i++) {
			Sheep clone = sheep.clone();
			System.out.println(clone);
		}
		
	}
}
