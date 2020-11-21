package com.atguigu.principle.inversion;

public class DependecyInversion2 {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}
}
interface IReceive {
	String getInfo(); 
}
class Email1 implements IReceive {
	@Override
	public String getInfo () {
		return "电子邮件信息：hello ,World";
	}
}
// 完成Person接收消息的功能
// 1 简单，容易想到
// 但是如果我们获取的是微信，短信等 就要新加类
// 解决思路： 引入一个抽象的接口IReceive表示接收者
// 因为Email,Weixin 都属于接收者范围 它们各自实现IReceiver接口就ok 符合依赖倒置
class Person1 {
	public void receive(IReceive iReceive) {
		System.out.println(iReceive.getInfo());
	}
}