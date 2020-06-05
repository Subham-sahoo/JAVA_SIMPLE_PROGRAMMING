package Comparable_Comparator;

import java.util.TreeSet;

public class TreeSet_Integer {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new My_Comparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		t.add(5);
		
		System.out.println(t);

		
	}

}

