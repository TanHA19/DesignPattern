package com.atguigu.adapter.objectadapter;

public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V;
	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}
	@Override
	public int outPut5V() {
		int outPut220V = this.voltage220V.outPut220V();
		int d = outPut220V / 44 ;
		System.out.print("使用对象适配器 转换电压 "+d+" V ");
		return d;
	}

}
