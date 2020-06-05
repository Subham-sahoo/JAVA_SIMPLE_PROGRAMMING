package practicechapter;

public class Sorting_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 32, 43, 98, 34 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j++;
				}
			}
			for (i= 0; i < arr.length-1; i++) {
				System.out.println(arr[i]);
			}
		}

	}
}