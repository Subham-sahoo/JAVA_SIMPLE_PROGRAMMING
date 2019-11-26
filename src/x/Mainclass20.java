package x;

import java.util.HashMap;

public class Mainclass20 {

	

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Bapa");
		map.put(2, "maa");
		map.put(3, "Sinu");
		map.put(4, "Rinu");
		map.put(5, "Raja");
		for(int i=1;i<=map.size();i++) {
			System.out.println(map.get(i));
		}
	}  
}