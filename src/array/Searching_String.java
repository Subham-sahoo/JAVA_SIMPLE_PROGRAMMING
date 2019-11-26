package array;

public class Searching_String {
public static void main(String[] args) 
	{
	String s="java";
     char ch='a';
     int flag=0;
    for(int i=0;i<s.length();i++)
     {
    	if(s.charAt(1)==ch)
    	{
    flag=1;
    	break;
    	}
     }
     if(flag==1)
    	 System.out.println("present");
     else
    	 System.out.println("not present");
	}

}

