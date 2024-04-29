package BasicPrograms;

public class SwappingOfThreeNum {
	public static void main(String[] args) {

		 int a = 5;
	        int b = 10;
	        int c = 15;

	        a = a + b + c;  // Step 1: a now holds the sum of all three numbers
	        b = a - (b + c);  // Step 2: b now holds the value of the original a
	        c = a - (b + c);  // Step 3: c now holds the value of the original b

	        // Now a, b, and c are swapped
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);

	}
}
