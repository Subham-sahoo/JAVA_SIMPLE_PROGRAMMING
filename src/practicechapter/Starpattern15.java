package practicechapter;

public class Starpattern15 {

	public static void main(String[] args) {
		int n = 5;
		char c = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (c + j - 1) + " ");
				//System.out.print((char) ('A' + j - 1) + " ");
			}
			System.out.println();
		}

	}
}
