package practicechapter;

import java.util.Scanner;

public class StarPattern14 {
public static void main(String[] args) {
	System.out.println("Enter no of lines");
	Scanner scan= new Scanner(System.in);
	int no=scan.nextInt();
	int number=1;
	int spaces=no;
		for(int i=0;i<=no;i++) {
			for(int s=0;s<=spaces;s++) {
				System.out.println(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
				number= number * (i-j)/(j+1);
			}
			spaces--;
			System.out.println();
		}

	}

}
