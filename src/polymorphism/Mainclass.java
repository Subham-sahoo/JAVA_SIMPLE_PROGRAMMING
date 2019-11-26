package polymorphism;

public class Mainclass {

	public static void main(String[] args) 
	{
		FaceBook fb1 = new FaceBook();
		fb1.login("java@gmail.com","java");
		fb1.login("google");
		fb1.login(7381439876l, "java");
		}
}
