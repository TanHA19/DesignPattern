package com.atguigu.bridge;

public class FoldedPhone extends Phone{

	public FoldedPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	

	protected void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("孵京返字");
	}
	
	
	
	protected void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("孵京返字");
	}
	

	protected void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("孵京返字");
	}
}
