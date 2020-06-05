package x;
public class Pattern1223 {
	public static void main(String[] args)
	{
			int n=5,star=5,space=0;
			for(int i=1;i<=n;i++)
					{
				for(int j=1;j<=i;j++)
				{
			System.out.print(" ");
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
				}
					}
    		  }
    		  
}
