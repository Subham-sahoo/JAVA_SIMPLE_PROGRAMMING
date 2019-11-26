
public class Mainclass10 {

	public static void main(String[] args) {
	Onlineshoping ref = new pactto();//upcasting
	ref.Onlineshop();
	Onlineshoping ref1 = new Amazon();//upcasting
	ref1.Onlineshop();
	System.out.println("-----------------");
	Amazon ref2=(Amazon)ref1;//downcasting
	ref2.Amazon();
	System.out.println(ref2.i);
	ref2.Onlineshop();
	System.out.println("--------------");
	pactto ref3 =(pactto)ref;
	ref3.pactto();
	System.out.println(ref3.i);
	}
}
