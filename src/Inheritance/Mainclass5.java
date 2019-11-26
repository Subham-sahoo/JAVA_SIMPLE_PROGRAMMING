package Inheritance;

public class Mainclass5 
{
	public static void main(String[] args) {
		Sample3 ref=new Sample3();
		System.out.println("i value is "+ref.i);
		System.out.println("d value is "+ref.d);
		ref.dis();
		ref.test();
	}
	
	}



 class Sample4
{
	int i=100;
	void dis()
	{
		System.out.println("display in sample1");
		
			}
}
class Sample3 extends Sample4
{
	double d=3.3;
	void test()
	{
		System.out.println("test in sample2");
	}
}



	


