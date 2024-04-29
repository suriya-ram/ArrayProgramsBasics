package BasicPrograms;

public class BubbleSort {
//bubble sort ascending order
	public static void main(String[] args) {

		int arr[] = { 1,50, 40, 30, 20, 10,90,80 };

		for (int j = 0; j < arr.length-1 ; j++) {
			for (int i = 0; i < arr.length - j-1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
