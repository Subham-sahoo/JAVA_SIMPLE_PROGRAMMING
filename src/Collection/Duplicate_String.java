package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_String 
{
	public static void main(String[] args) {


String str[]= {"java","javascript","c++","paython","ruby","java"};
	Map<String,Integer> map=new HashMap<String,Integer>();{
			for(String st:str) {
				Integer count=map.get(str);
				if(count==null) {
					map.put(st, 1);
			}
				else {
					map.put(st, count++);
				}
			
}
	Set<Entry<String,Integer>>entryset=map.entrySet();		
	
	for(Entry<String,Integer>entry:entryset) {
		if(entry.getValue()>1) {
		
			System.out.println("duplicate element is::"+entry.getKey());

		}
	}
}
}
}
