package staticvariable;

public class Sample12{
	static int i=20;
	static int j=30;
public static void M()
{
//	System.out.println("static function");
}
	public static void main(String[] args) {
		System.out.println("i value is "+Sample12.i);
		Sample12.M();
		System.out.println("i value is "+Sample12.i);
		System.out.println("j value is "+Sample12.j);
		System.out.println("k value is "+Sample13.k);
		System.out.println("m value is "+Sample13.m);
	}
 }
 class Sample13{
	static int k=200;
	static int m=300;
public static void M()
{
	System.out.println("static function");
}
}