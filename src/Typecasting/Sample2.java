package Typecasting;

public class Sample2 
{
	int i=100;
	
	
	void disp()
	{
		System.out.println("Display in Sample2");
	}
}
	class Sample3 extends Sample2
	{
	double d=2.2;
	void demo()
	{
		System.out.println("Demo in sample3");
	}
	}
		class Sample4 extends Sample3
		{
		String c="raj";
		void test()
		{
			System.out.println("Test in sample4");
		}
		}
