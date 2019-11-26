package multilevelinheritance;

public class Sample1 
{
	int i =10;
	void raja()
	{
		System.out.println("raja1");
		
	}
}
 class Sample2 extends Sample1
{
	double d=1.54;
	void rinu()
	{
		System.out.println("rinu2");
	}
}
    class Sample3 extends Sample2
	{
		char c='A';
				void jinu()
				{
		System.out.println("jinu3");
				}
	}

