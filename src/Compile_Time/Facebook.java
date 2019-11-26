package Compile_Time;

public class Facebook 
{
	void login(String Email_id,String Password)
	{
		System.out.println("Logged in by using Mail_id & Password");
	}
	void login(Long ph_No,String Password)
	{
		System.out.println("Logged in by using Ph_No & Password");
	}
	class UpdateFacebook extends Facebook
	{
		<google>void login(String googlegoogle)
		{
			System.out.println("Logged in by using Google account");
		
		}
	}


		

	}


