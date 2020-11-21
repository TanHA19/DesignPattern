package com.atguigu.adapter.classadapter;

public class Phone {

	public void charging(IVoltage5V v) {
		if (v.outPut5V() == 5) {
			System.out.println("充电中");
		} else {
			System.out.println("电压过高");
		}
	}
}
