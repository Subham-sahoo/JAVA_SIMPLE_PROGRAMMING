package NewJava_Advance_Runnable;

public class MyRunnable_Test {

	public static void main(String[] args) {
		Runnable r=()->{
		for(int i=1;i<=5;i++) {
			 System.out.println("Child class");
		 }
		};
	//	r.run();
		Thread t=new Thread(r);
t.start();
for(int i=1;i<=5;i++) {
	 System.out.println("Main class");
}
	}

}
