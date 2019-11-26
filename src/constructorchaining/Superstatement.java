package constructorchaining;

public class Superstatement 
{
	Superstatement()
	{
		super();
		System.out.println("display");
		
	}
}
	class Superstatement1 extends Superstatement
	{
		Superstatement1()
		{
			super();
			System.out.println("XXXXXXXXX");
		}
}
