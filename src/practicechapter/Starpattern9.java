package practicechapter;

public class Starpattern9 {

	public static void main(String[] args) 
	{
		int n=4;
	        for(int i=1;i<=n;i++) 
	        {
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" * ");
			}
			 System.out.println();
			}
	        for(int i=1;i<=n;i++) 
	        {
			for(int j=3;j>=i;j--) 
			{
				System.out.print(" * ");
			}
			 System.out.println();
			}
	        
		  }
   }
