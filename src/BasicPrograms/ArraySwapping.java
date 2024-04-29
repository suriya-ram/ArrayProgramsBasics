package BasicPrograms;

public class ArraySwapping {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		int i = 0;
		int j = a.length - 1;
		int temp;

		while (i != j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;

			i++;
			j--;

		}
		System.out.println("after swapping");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}