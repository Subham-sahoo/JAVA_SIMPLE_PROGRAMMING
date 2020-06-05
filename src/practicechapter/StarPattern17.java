package practicechapter;

public class StarPattern17 {

	public static void main(String[] args) {

		int n = 5;
		char c = 'P';
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				c = Character.toLowerCase(c);
			} else {
				c = Character.toUpperCase(c);
			}

			for (int j = 1; j <= n - i + 1; j++) {

				System.out.print(c + " ");

			}
			c++;
			System.out.println();
		}
	}

}
