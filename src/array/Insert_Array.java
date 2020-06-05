package array;

public class Insert_Array {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int Insert_element = 100;
		int pos = 3;
		for (int i = arr.length - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = Insert_element;
		for (int i = 0; i <
				arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
