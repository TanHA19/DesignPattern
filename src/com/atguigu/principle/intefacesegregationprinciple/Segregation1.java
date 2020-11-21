package com.atguigu.principle.intefacesegregationprinciple;

public class Segregation1 {
	public static void main(String[] args) {
		
	}
}
interface Interface1 {
	void operation1();

}
interface Interface2 {	
	void operation2();
	void operation3();

}
interface Interface3 {	
	void operation4();
	void operation5();

}
class B implements Interface1,Interface2{

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("B 实现了 Interface1 中的 operation1");
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		System.out.println("B 实现了 Interface1 中的 operation2");
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		System.out.println("B 实现了 Interface1 中的 operation3");
	}

}

class D implements Interface1,Interface3{

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		System.out.println("D 实现了 Interface1 中的 operation1");
	}

	@Override
	public void operation4() {
		// TODO Auto-generated method stub
		System.out.println("D 实现了 Interface1 中的 operation4");
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
		System.out.println("D 实现了 Interface1 中的 operation4");
	}


}
// A 类通过接口Interface1依赖 B类，但是都只会用到1，2，3这几个方法
class A {
	public void depend1(Interface1 interface1 ) {
		interface1.operation1();
	}
	public void depend2(Interface2 interface2 ) {
		interface2.operation2();
	}
	public void depend3(Interface2 interface2 ) {
		interface2.operation3();
	}
}

// C 类通过接口Interface1依赖 B类，但是都只会用到1，4，5这几个方法
	class C {
		public void depend1(Interface1 interface1 ) {
			interface1.operation1();
		}
		public void depend4(Interface3 interface3 ) {
			interface3.operation4();
		}
		public void depend5(Interface3 interface3 ) {
			interface3.operation5();
		}
	}