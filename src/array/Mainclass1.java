package array;
public class Mainclass1 {

	public static void main(String[] args) 
	{
		int[][] arr={{1,2,3},{4,5,6}};
	for(int i=0;i<arr.length;i++)
	{
		int a=0;
		for(int j=0;j<arr[i].length;j++)
		{
			a=a+arr[i][j];
			System.out.println(a);
		}
	}
	}
}
		
