package practicechapter;

import java.util.Scanner;

public class Login_Page {

	public static void main(String[] args) {
		String User_name;
		String Pasword;
		User_name = "Subham";
		Pasword = "123ab";
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter User_Name");
		String username = Scan.next();
		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Enter Password");
		String Pasword1 = Scan1.next();

		if (User_name.equals(username) && Pasword.equals(Pasword1)) {
			System.out.println("welcome Loginpage opened");
		} else {
			
			System.out.println("Username Or Password is Incorrect");
		}
	}

}
