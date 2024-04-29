package BasicPrograms;

public class OddValuesInAnotherArray {
	public static void main(String[] args) {

		int a[] = { 8, 3, 3, 8, 5, 8, 10, 10, 1000, 80 };

		int len = a.length / 2; // 2
		int b[] = new int[len];

		int j = 0;
		for (int i = 1; i < a.length; i += 2)

		{
			b[j] = a[i];
			j++;
		}

		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);

	}

}
