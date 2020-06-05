package array;

public class Delete_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int delete_Element = 40;
		for (int i = 0; i < arr.length; i++) {
			if (delete_Element == arr[i]) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];

				}
				break;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println(arr[i]);

		}
	}

}
