package com.tx.wl.p14;

/*14.	System.gc()�����������ã���ͨ����������*/
public class SystemDemo {
	public static void main(String[] args) throws Throwable {
		TestA t = new TestA();
		t.setStr("sss");
		System.out.println("����Ķ�����" + t.getStr());
		t.finalize();
		System.gc();
	}
}
