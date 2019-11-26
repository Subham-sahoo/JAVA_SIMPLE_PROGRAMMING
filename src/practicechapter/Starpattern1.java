package practicechapter;

public class Starpattern1 {

	public static void main(String[] args) 
	{
		int space=0;
	for	(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int k=3;k>=i+3;k--) {
			System.out.println("-");
			space++;
		}
		System.out.println();
		}

	}

}
