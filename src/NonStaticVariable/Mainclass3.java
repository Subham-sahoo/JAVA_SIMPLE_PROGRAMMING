package NonStaticVariable;

public class Mainclass3 {
	int i =200;
	double j=20.3;
	char m ='g';
	
public void M()
	{
	System.out.println("i value is "+i);
	System.out.println("j value is "+j);
	System.out.println("m value is "+m);
	}
	public static void main (String args [])
	{
	System.out.println("i value is "+new Mainclass3().i);
	System.out.println("j value is "+new Mainclass3().j);
	System.out.println("m value is "+new Mainclass3().m);
}
}