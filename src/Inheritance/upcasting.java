package Inheritance;

public class upcasting 
{
	int i=100;
	void demo()
	{
		System.out.println("display in upcast");
		}
}
class Sample extends upcasting
{
	void disp()
	{
		System.out.println("display in sample1");
	}
}
class Sample00 extends Sample

{
	void test()
	{
		System.out.println("display in sample2");
	}
}
