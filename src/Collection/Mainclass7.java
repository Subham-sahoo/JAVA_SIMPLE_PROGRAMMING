package Collection;

import java.util.Hashtable;
import java.util.Set;

public class Mainclass7 {

	


	public static void main(String[] args) 
	{
	Hashtable Map=new Hashtable();
	Map.put("java",32);
	Map.put(12,"java");
	Set Keys=Map.keySet();
	for(Object key:Keys)
	{
		System.out.println(key+"="+Map.get(key));
	}
	}

}
