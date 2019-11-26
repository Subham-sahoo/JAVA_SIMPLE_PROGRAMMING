package Inheritance;

public class Sample1 {
    int i=200;
	int j=30;
	char c='a';
	void dis()
	{
    System.out.println("Display in sample1");
	}
}
class Sample2 extends Sample1
{
	double d=2.3;
	void test()
	{
		System.out.println("Test in sample2");
		}
}
