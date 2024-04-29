package BasicPrograms;

public class MultiplicationOfArrays {

	public static void main(String[] args) {

		// single dimension arary
		int a[] = { 2, 8, 9, 9, 10, 80 };
		int b[] = { 1, 9, 7, 7, 10, 90, 10 };
		int len1 = a.length;
		int len2 = b.length;
		// int c[];

		int small, big;
		if (len1 < len2) {
			small = len1;
			big = len2;

		} else {
			small = len2;
			big = len1;
		}
		int c[] = new int[len2];

		for (int i = 0; i < small; i++) {
			c[i] = a[i] * b[i];
		}

		for (int i = small; i < c.length; i++) {

			if (a.length > b.length) {
				c[i] = a[i];
			}

			else {
				c[i] = b[i];
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
