package String;

import java.util.Scanner;

public class Reverse_Of_A_Name {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name");
		
		String s1 = scan.nextLine();
	
		String[] str = s1.split(" ");
		
		String ch = "";
		String rev = "";
		for (int i = 0; i < str.length; i++) {

			ch = str[i];
			
			for (int j = ch.length() - 1; j >= 0; j--) {
				rev = rev + ch.charAt(j);

			}
			System.out.println(rev);
		}
	}
	}

