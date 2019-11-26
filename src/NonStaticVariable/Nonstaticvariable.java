package NonStaticVariable;

public class Nonstaticvariable {
	public static void main(String[] args) {
		System.out.println("main method");
		Sample2 ref1= new Sample2();
		System.out.println(ref1.i);
		Sample2 ref2 = new Sample2();
		System.out.println(ref2.j);
		
	}
	}


class Sample2
{
int i=200;
int j=100;
{
	i=300;
	//System.out.println("Non static block");
	
}
}


