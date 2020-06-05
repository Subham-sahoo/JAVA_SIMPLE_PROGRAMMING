package NewJava_Advance_Array;

import java.util.*;

  class My_Comparator implements Comparator<Integer> {
public int comparable (Integer i1,Integer i2) {
	return i1<i2?-1:i1<i2?1:0;
	/*if(i1<i2) {
		
	return -1;
	}
	else if(i1>i2) {
		
		return 1;
		}
	else {
		
		return 0;
		}*/
}

@Override
public int compare(Integer o1, Integer o2) {

	return 0;
}


}
