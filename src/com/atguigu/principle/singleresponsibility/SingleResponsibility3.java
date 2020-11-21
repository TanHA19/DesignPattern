package com.atguigu.principle.singleresponsibility;

/**
 * 单一职责
 * 降低类的复杂度，一个类只负责一项职责
 * 提高类的可度性，可维护性
 * 降低变更引法的风险
 * 通常情况下，我们应遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则
 * ，只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * 
 * @author tan
 *
 */
public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("汽车");
		vehicle2.runAir("飞机");
	}
	
}
// 方案3 没有对原来的类做大的修改，只是增加修改
//虽然没有在类级别遵守单一职责原则，但是在方法上遵守单一职责原则
class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle+ " 在公路上运行 。。。。。。");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+ " 在天空上运行 。。。。。。");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+ " 在水上运行 。。。。。。");
	}
}
