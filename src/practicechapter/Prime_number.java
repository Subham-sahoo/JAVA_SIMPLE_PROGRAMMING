package practicechapter;
public class Prime_number 
{
	static void checkprime (int n)
	{
	int m=0,flag=0;
	m=n/2;
	if (n==0||n==1) {
		System.out.println(n+"is not prime");
	}
	else {
		for(int i=2;i<=m;i++) {
			System.out.println(n +"is not prime");
			flag=1;
			break;
		}
	}
	if (flag==0);
	System.out.println(n+"is prime no");
}
public static void main(String[] args) {
	checkprime(17);
}
}
	
