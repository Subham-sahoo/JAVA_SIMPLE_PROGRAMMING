package Collection;

import java.util.ArrayList;

public class Mainclass1
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add(12);
		al.add("java");
		al.add("java");
		al.add(null);
		al.add(2,100);
		System.out.println("no of element in collection"+"= " +al.size());
	for(Object obj:al)
	System.out.println(obj);
	}	
	}
		


