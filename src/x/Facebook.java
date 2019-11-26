package x;

public class Facebook 
{
	void login(String UserName,String password)
	{
		System.out.println("logged in by UserName and Password");
	}
	void login(int ph_no,String password)
	{
		System.out.println("Logged by ph_no and Password");
	}
	class Facebookupdate extends Facebook
	{
		void login(String google)
		{
			System.out.println("logged in google account");
		}
	}
}