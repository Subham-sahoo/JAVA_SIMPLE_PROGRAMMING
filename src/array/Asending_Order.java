package array;
public class Asending_Order {

	public static void main(String[] args) {
	
int[]arr = {10,9,5,6,3,1};
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
	if(arr[i]>arr[j])
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
}
for(int j=0;j<arr.length;j++)
{
	System.out.println(arr[j]);
}

	}

}
