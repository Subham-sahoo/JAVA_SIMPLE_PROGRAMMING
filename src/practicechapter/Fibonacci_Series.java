package practicechapter;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n=10,t1=0,t2=1;
		for(int i=1;i<=n;i++)
		{
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			//System.out.println(t1 + " + ");
			System.out.println(t2 + " + ");
		}

	}

}
