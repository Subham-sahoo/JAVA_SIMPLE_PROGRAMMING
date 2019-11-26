package practicechapter;

public class Heartshape {

	public static void main(String[] args) 
	{
	
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=7;j++) {
			if(((i==1)&&(j%3!=0))||((j==2)&&(j%3==0))||(j-i==2)||(i+j==8)) {
				System.out.print("*");
		}
			else {
				System.out.print(" +");
			}
			    }
		System.out.println();

	}


	}

}
