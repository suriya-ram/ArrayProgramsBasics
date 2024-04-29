package BasicPrograms;

public class NegativeValuesInAnotherArray {

	public static void main(String[] args) {

		int a[] = { 2, 9, -10, -20, 30, -90, -200, -90, 100 };

		int countOfNegative = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				countOfNegative++;

		}
		System.out.println(countOfNegative);

		int b[] = new int[countOfNegative];

		int j = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {

				b[j] = a[i];
				j++;

			}

		}

		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);

	}

}
