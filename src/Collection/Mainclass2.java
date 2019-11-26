package Collection;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Mainclass2 {

	public static void main(String[] args) 
	{
		LinkedList al= new LinkedList();
		al.add("13");
		al.add("java");
		al.add("java");
        al.add("raja");
		al.add("15");
		al.add(null);
		al.add("3,100");
		System.out.println("no of element on Arraylist"+"= "+al.size());
		System.out.println("-----Iterator----");
		Iterator i1= al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
			//System.out.println(i1.next());
			System.out.println(Integer.parseInt("123a"));
		}
	
	}


