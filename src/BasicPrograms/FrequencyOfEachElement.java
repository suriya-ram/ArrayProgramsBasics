package BasicPrograms;

public class FrequencyOfEachElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40,50,50,50,50, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 80, 90 };

		int freq[] = new int[a.length];

		int i;
		for (i = 0; i < a.length; i++) {
			int firstOccurence = a[i];
			int count = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (firstOccurence == a[j]) {
					count++;
					freq[j] = -1;
				}
			}

			if (freq[i] != -1)
				freq[i] = count;

		}

		for (i = 0; i < a.length; i++) {

			// .out.println("frequency of each element "+ a[i] + " "+freq[i]);
			// System.out.println(" ******************");
			if (freq[i] > 0)

				System.out.println("frequency of each element  " + a[i] + " " + freq[i]);
			if (freq[i] == 1)
				System.out.println("frequency of each element  " + a[i] + " " + freq[i]);

		}
		
		int max=Integer.MIN_VALUE;
		int position =0;
		
		for( i =0; i< freq.length;  i++)
		{
			 if(freq[i] >max) {
				 max = freq[i];
			 position=i;}
		}
		System.out.println("the most occurence of an element"+ " "+position+" " + max);
		System.out.println(a[position]);
 		
	}

}
