package This;

public class Test3 
{
	void m1(Test3 d) {
		System.out.println("xyz");
	}
	void m2() {
		m1(this);
	}
 

}
