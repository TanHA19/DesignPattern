package com.atguigu.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int outPut5V() {
		int outPut220V = super.outPut220V();
		int d = outPut220V / 44 ;
		System.out.print("×ª»»µçÑ¹ "+d+" V ");
		return d;
	}

}
