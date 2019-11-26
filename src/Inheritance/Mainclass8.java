package Inheritance;

public class Mainclass8 {

	public static void main(String[] args) {
		Sample12 ref=new Sample12();
		 System.out.println("i value is "+ref.i);
		 System.out.println("c value is "+ref.c);
		 System.out.println("D value is "+ref.d);
		 System.out.println("g value is "+ref.g);
		 Sample13 ref1 = new Sample13();
		 System.out.println("D value is "+ref1.d);
		 Sample14 ref2 = new Sample14();
		 System.out.println("c value is "+ref2.c);
		 ref.dis();
		 ref2.demo();
		 ref1.test();

	}

}
