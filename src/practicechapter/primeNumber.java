package practicechapter;

public class primeNumber {

	public static void main(String[] args) 
	{
		Boolean flag=false;
		
		int n =22;
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
			{
				flag=true;
				break;
				}
	         if(!flag)	
	              System.out.println(n+" no is prime");
		else 
			System.out.println(n+" no is not prime");
			
			}
		
	}


