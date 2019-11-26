package Collection;


import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(new student());
		al.add(new Employee());
		al.add("java");
		al.add(null);
		al.add(100);
		al.add(3,300);
		System.out.println("-----Iterator-------");
		java.util.Iterator i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
