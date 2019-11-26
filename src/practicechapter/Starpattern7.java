package practicechapter;

import java.util.Scanner;

public class Starpattern7 {

	public static void main(String[] args)
	{
		int lines=0;
		int space=0;
		int val=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		lines=sc.nextInt();
		space=(lines*2)-2;
		for(int i=1;i<=lines;i++) //outer looping
	    {
		for(int L=1;L<=i;L++) //left part
		{
			System.out.print(val);
		}
       for(int S=1;S<=space;S++) //For spacing
       {
	      System.out.print(" ");
       }
      for(int R=1;R<=i;R++) //for Right part
      {
	    System.out.print(val);
      }
      space=space-2;
      val=val+1;
      System.out.println();
	}
	   }
	}
	
	


