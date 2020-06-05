package NewJava_Advance_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
ArrayList al =new ArrayList<Integer>();
al.add(100);
al.add(256);
al.add(506);
al.add(487);
System.out.println("Arraylist is "+ al);
Collections.sort(al, new My_Comparator());
System.out.println(al);
Comparator<Integer> c= (i1,i2)-> i1<i2?-1:i1<i2?1:0;
al.stream().forEach(System.out::println);
List<Integer> l2=al.stream().filter(i->i%2==0).collect(Collections.toList());
System.out.println(l2);
	}

	
}
