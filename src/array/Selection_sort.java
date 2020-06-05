package array;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = { 100, 2, 32, 43, 55, 25, 62, 6 };
		int n = arr.length;
		System.out.println("unsorted Array");
		// Unsorted array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ,");
		}
		//Selection sort
		for (int i = 0; i < n - 1; i++) {
			int min = arr[i];
			int pos = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					pos = j;
				}

			}
			//swapping of numbers
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;

		}
		System.out.println("Sorted Array");
//Sorted array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ,");
		}

	}

}
