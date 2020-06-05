package Anonymous;
class GreetingIndia{
	public void sayHello() {
		System.out.println("Hello");
	}
}

public class India {
	GreetingIndia g= new GreetingIndia() {
		public void sayHello() {
			System.out.println("hiii");
		}
	
};
}
