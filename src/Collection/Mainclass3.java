package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Mainclass3 {

	public static void main(String[] args)
	{
		LinkedHashSet v=new LinkedHashSet();
		//System.out.println("No of element in vector"+"= "+v.capacity());
		System.out.println("No of element in arrayList are"+"= "+v.size());
		v.add(12);
		v.add(15);
		v.add(118);
		v.add(40);
		v.add(300);
		v.add(200);
		v.add(100);
		v.add(null);
		Iterator i1=v.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
