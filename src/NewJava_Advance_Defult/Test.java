package NewJava_Advance_Defult;

import java.util.ArrayList;

interface Left{ 
	default void m1() {
		System.out.println("Left Method Execute");
	}
}
interface right{
	default void m1() {
		System.out.println("Right Method Execute");
	}
}

 class Test  implements Left ,right{
	 public static void main(String[] args) {
		 
		 ArrayList ar = new ArrayList();
		 ar.add("test");
		 ar.add("test1");
		 ar.add("test2");
		 ar.add("test3");
		 System.out.println("Value "+ar.lastIndexOf("test5"));
		 
		
		 

		 Test t=new Test();
		 t.m1();
	 }
		 
	 public void m1() {
		 System.out.println("hhdhbzh");
		 
	 }




 }
 


