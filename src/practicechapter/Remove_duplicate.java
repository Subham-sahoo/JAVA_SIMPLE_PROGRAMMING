package practicechapter;

public class Remove_duplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 4, 5 };
		int[] temp = new int[arr.length - 1];

		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}

		}
		temp[j] = arr[arr.length - 1];

		for (int i = 0; i < temp.length-2; i++) {
			System.out.println(temp[i] + " ");
		}
	}

}
