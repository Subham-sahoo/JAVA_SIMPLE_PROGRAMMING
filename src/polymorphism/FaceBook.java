package polymorphism;

public class FaceBook<google>
{
	void login(String Username,String password)
	{
		System.out.println("logged by using Username and password");
	}
	
void login(long phonenumber,String password)
{
	System.out.println("logged by using phone number and password");
}
 <google> void login(google google) 
{
System.out.println("logged by google Account");	
}
}


