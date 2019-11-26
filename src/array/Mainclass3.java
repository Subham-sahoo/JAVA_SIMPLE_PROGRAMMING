package array;

public class Mainclass3 {

	public static void main(String[] args)
	{
int[] arr= {1,2,3,4,5,6,7,8,9,10};
int ele=9,flag=0 ;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==ele)
	{
		flag=1;
		break;
	}
}
if(flag==1)
	
{
	System.out.println("present");
}
else
{
	System.out.println("not present");
}
	}
	

}
