package array;

public class Mainclass4 {

	public static void main(String[] args) 
	{
String s="java";
char ele='j';
int flag=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==ele)
	{
	break;
	}
}
if(flag==1)
System.out.println("present");
else
	System.out.println("not present");
	}
}
