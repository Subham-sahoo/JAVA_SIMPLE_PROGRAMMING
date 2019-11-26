package Typecasting;

public class Mainclass2 
{
public static void main(String[] args) {
	 Sample2 ref = new Sample3();//upcasting
	 Sample3 ref2=(Sample3)ref;//downcasting
	 Sample4 ref1 = new Sample4();//upcasting
	 Sample4 ref3=(Sample4)ref1;//downcasting
	 Sample2 ref4= new Sample4();
	System.out.println(ref.i);
System.out.println(ref1.d);
System.out.println(ref3.c);
ref.disp();
ref1.demo();
ref3.test();
}
	}
