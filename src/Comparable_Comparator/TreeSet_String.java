package Comparable_Comparator;

import java.util.TreeSet;

public class TreeSet_String {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new My_Comparator1());
		t.add("raja");
		t.add("Gobinda");
		t.add("subha");
		t.add("Shiva");
		t.add("Krishna");
		t.add("zigma");
		
		System.out.println(t);

		
	}

}
