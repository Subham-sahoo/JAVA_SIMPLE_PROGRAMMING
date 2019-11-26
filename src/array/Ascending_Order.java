package src.array;

public class Ascending_Order {

	public static void main(String[] args) 
	{
	int [] arr= {15,32,45,2,1};
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	
	for(int j=i+1;j<arr.length;j++) 
	{
		if(arr[i]>arr[j])
		{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
	}
	}
for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}
}
}
