package Collection;

import java.util.ArrayList;

public class Mainclass5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(new student());
		al.add(new Employee());
		al.add("java");
		al.add(null);
		al.add(100);
		al.add(3,300);
		System.out.println("------for each------");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		   }
	}
