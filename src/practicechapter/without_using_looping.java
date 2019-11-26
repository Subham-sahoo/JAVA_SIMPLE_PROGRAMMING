package practicechapter;

public class without_using_looping {
	public static void PrintNos(int n) {
		if (n > 0) {
			PrintNos(n - 1);
			System.out.println(n + " ");
		}
		return;

	}

	public static void main(String[] args) {
		PrintNos(5);
	}

}

