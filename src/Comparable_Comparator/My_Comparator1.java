package Comparable_Comparator;

import java.util.Comparator;
class My_Comparator1  implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		
		String s1=obj1.toString();
		String s2=(String)obj2;
		return s1.compareTo(s2);
	}
		
	}


