package Abstraction;

abstract class Online {
	abstract void show();
}

class Amazon extends Online {
	void show() {
		System.out.println("Shopping in Mobile");
	}
}

class Flipkart extends Online {
	void show() {
		System.out.println("Shopping in Electronice");
	}
}
