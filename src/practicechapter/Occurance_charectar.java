package practicechapter;

import java.util.HashMap;
import java.util.Map;

public class Occurance_charectar 
{
	static void charactercount(String InputString)
	{
	HashMap<Character,Integer>CharcountMap=new HashMap<Character,Integer>();
	//convert String to Character
	char[] StrArr=InputString.toCharArray();
	for(char c:StrArr)
	{
		if( CharcountMap.containsKey(c))
		{
			CharcountMap.put(c, CharcountMap.get(c)+1);
		}
		else {
			CharcountMap.put(c,1);
		}
	}
	for(Map.Entry entry:CharcountMap.entrySet()) {
	System.out.println(entry.getKey()+"="+entry.getValue());	
	}
	}
public static void main(String[] args) {
	String str="Subham";
	charactercount(str);
    }

}
