package x;

import java.util.HashMap;

public class Mainclass3 
{
public static void main(String[] args) 

{
	String str="hello";
	HashMap<Character,Integer> map= new HashMap();
	
	char[] ch=str.toCharArray();
	
	for(char chars:ch) {
		
		if(!map.containsKey(ch)) {
			
			map.put(chars,1);
	}
		else {
		int value=map.get(ch);
			map.put(chars, value+1);
		}
			
		}
	System.out.println(map);
}
	
	}

