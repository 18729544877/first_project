package com.tx.wl.p06;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("小米", 3);
		cat.showInfo();
		cat.eat();
		cat.jiao();
		cat.walk();

		Dog d = new Dog("王子", 3);
		d.showInfo();
		d.eat();
		d.look();
		d.jiao();
		d.walk();
	}
}
