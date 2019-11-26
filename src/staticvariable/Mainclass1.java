package staticvariable;

public class Mainclass1 {
	int i=220;
	double j=30.0;
	//public void test()
	{
		System.out.println("instance function member");
		System.out.println("i value is "+i);
	}
		public static void main(String[]args)
		{
			Mainclass1 ref=new Mainclass1();
		System.out.println("i value is "+ref.i);
		//new Mainclass1().test();
		System.out.println("--------- ");
		System.out.println("j value is "+ new Mainclass1().j);

	}

}
 