
package String;

   public class Pallindrom
{
   public static void main(String[] args) 
	{
	String str ="MALAYALAM";

	StringBuffer buff=new StringBuffer() ;
	buff.reverse();
	String rev=buff.toString();
	if(str.equals(rev)) {
		System.out.println("Palindrom");
	}
	else {
		System.out.println("Not Palindrom");
	}
	
	}

}
