package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList_Iterator_Function {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(0, "java");
		al.add("xxxxxxx");
		al.add("xxxxxx");
		al.add("ram");
		al.add(new student());
		System.out.println("array size:=" + al.size());
		ArrayList al1 = new ArrayList();
		al1.add(0, "java");
		al1.add("xxxxxxx");
		al1.add("xxxxxx");
		al1.add("ram");
		al1.add(new student());
		System.out.println("array size:=" + al1.size());
		System.out.println(al.retainAll(al1));
		
		/*System.out.println("---forEach----------");
		for (Object obj : al) {
			System.out.println(obj);*/
			/*System.out.println("-----Iterator-----");
			
			  Iterator i1=al.iterator();
			   while(i1.hasNext()) {
			  System.out.println(i1.next());
			  
			 }*/
			 
		}
	}

