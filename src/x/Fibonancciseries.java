package x;

public class Fibonancciseries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, count = 10;
		System.out.print("test ");
		System.out.print(n1 + "," + n2);
		for (int i = 2; i <= 10; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(","+n3);
		}
	}

}
