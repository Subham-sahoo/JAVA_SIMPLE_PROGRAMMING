package practicechapter;

import java.util.Scanner;

public class starpattern6 {
public static void main(String[] args) 
	{
		int lines=0;
		int space=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		lines=sc.nextInt();
		space=(lines*2)-2;
     for(int i=1;i<=lines;i++)//no of lines
     {
	for(int l=1;l<=i;l++) //left part
	{                      
		System.out.print(l);
	}
	for(int s=1;s<=space;s++) 
	{
		System.out.print(" ");
	}
	for(int r=1;r<=i;r++) //left part
	{                    
		System.out.print(r);
	}
	space=space-2;
	
	System.out.println();
}

	}

}
