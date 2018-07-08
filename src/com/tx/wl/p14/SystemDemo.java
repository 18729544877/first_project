package com.tx.wl.p14;

/*14.	System.gc()概述，其作用，并通过代码体现*/
public class SystemDemo {
	public static void main(String[] args) throws Throwable {
		TestA t = new TestA();
		t.setStr("sss");
		System.out.println("传入的对象是" + t.getStr());
		t.finalize();
		System.gc();
	}
}
