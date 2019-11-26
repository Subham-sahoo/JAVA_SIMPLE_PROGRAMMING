package practicechapter;

public class Printnumber_in_A_String {

	public static void main(String[] args) 
	{
String str="The Order Name is 123456987";
String [] name=str.split(" ");

int stringSize=name.length;
System.out.println(name[stringSize-1]);

//System.out.println(str.substring(18,str.length()));



	}
}

