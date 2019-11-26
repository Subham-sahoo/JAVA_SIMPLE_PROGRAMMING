package staticvariable;

public class Mainclass2 {
	int i = 20;
	char c = 'a';

	public void M() {
		System.out.println("i value is " + i);
		System.out.println("c name is " + c);
	}

	public static void main(String[] args) {
		System.out.println("i value is " + new Mainclass2().i);
		System.out.println("c name is " + new Mainclass2().c);
	}
	}