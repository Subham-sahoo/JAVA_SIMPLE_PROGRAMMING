package practicechapter;
public class Prime_count_Number {
public static void checkPrime(int n) {
		int i, m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
		System.out.println(n+"n is not a prime");
		}
		else  {
			for( i=2;i<=m;i++) {
				if(n%i==0) {
				System.out.println(n+"n is not a prime");
				flag=1;
				break;
			}
			}
			if(flag==0) {
			System.out.println(n+"n is prime no");
			}
		}
    }

public static void main(String[] args) {
		checkPrime(1);
		checkPrime(23);
		checkPrime(10);
		checkPrime(19);
		checkPrime(15);
		checkPrime(16);
		checkPrime(12);
	}
}
  
	
	 
		
	
	

	



