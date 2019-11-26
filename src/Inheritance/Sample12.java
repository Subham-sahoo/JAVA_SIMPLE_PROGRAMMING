package Inheritance;

public class Sample12 {
	int i =34;
    char c='f';
    long g=1232232l;
    double d=1.3;
      void dis()
      {
    	  System.out.println("Display in Sample12");
    	  System.out.println(c);
      }
      }
class Sample13 extends Sample12
{
	double d=12.2;
	void test()
	{
		System.out.println("Test in Sample13");
		System.out.println(d);
	}
}
class Sample14 extends Sample13
{
	char c ='s';
	void demo()
	{
		System.out.println("Demo in Sample14");
		System.out.println(c);
	}
}