package com.atguigu.principle.inversion;

/**
 * 依赖关系传递的三种方式
 * 接口传递
 * 构造方法传递
 * setter方式传递
 * 
 * 底层模块尽量都要有抽象类或接口，或者两者都有，程序稳定更好
 * 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲
 * 层，利用程序扩展和优化
 * 继承时遵循里氏替换原则
 * @author tan
 *
 */
public class DependecyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}
}
class Email {
	public String getInfo () {
		return "电子邮件信息：hello ,World";
	}
}
// 完成Person接收消息的功能
// 1 简单，容易想到
// 但是如果我们获取的是微信，短信等 就要新加类
// 解决思路： 引入一个抽象的接口IReceive表示接收者
// 因为Email,Weixin 都属于接收者范围 它们各自实现IReceiver接口就ok 符合依赖倒置
class Person {
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}