package com.tx.wl.p14;

public class TestA {
	public String str;

	public TestA(String str) {
		super();
		this.str = str;
	}

	public TestA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "TestA [str=" + str + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(str + "±ªªÿ ’");
	}

}
