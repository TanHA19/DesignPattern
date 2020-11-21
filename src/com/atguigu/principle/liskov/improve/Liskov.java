package com.atguigu.principle.liskov.improve;

public class Liskov {
	public static void main(String[] args) {
		
	}
}
class Base {
	
}
class A extends Base{
	public int func1( int num1, int num2 ) {
		return num1 - num2;
	}
} 

class B extends Base {
	// 假如B需要使用A类的方法使用组合的关系
	private A a = new A();
	public int func1(int a,int b) {
		return a +  b;
	}
	
	public int func2(int a,int b) {
		return this.a.func1(a, b) + 20;
	}
}