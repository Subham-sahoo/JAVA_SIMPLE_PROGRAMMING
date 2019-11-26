package Inheritance;

public class Sample22 {
	int i=200;
	void dis()
	{
		System.out.println("display in Sample1");
	}
}
class Sample23 extends Sample22
{
	double d=3.3;
	void test()
	{
		System.out.println("test Sample2");
	}
}
class Sample24 extends Sample23
{
	char c='a';
	void demo()
	{
		System.out.println("demo is a Sample");
	}
	
}