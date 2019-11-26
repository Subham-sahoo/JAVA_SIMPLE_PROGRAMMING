package multilevelinheritance;

public class Mainclass5 {

	public static void main(String[] args) {
		Sample1 ref=(Sample1)new Sample2();//upcasting
ref.raja();
System.out.println(ref.i);

	}

}
