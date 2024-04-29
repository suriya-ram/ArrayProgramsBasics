package BasicPrograms;

public class AddingTwoArrays {

	public static void main(String[] args) {
		
	//2 arrays merged to one new array
		//addition of two array
	
	int[]  a =  {2,4,5};
	int[] b = {6,7};
	
	
	int size = a.length + b.length;
	int[] c = new int[size];
	
	for(int i =0; i< a.length ; i++)
	{
		c[i] = a[i];
		System.out.print(c[i]);
		
	}
	
	int j =0;
	for(int i=a.length ; i<c.length; i++)
	{
		c[i] = b[j];
		j++;
		System.out.print(c[i]);
		
	}
	System.out.println(" ");
	for(int i =0; i<c.length; i++)
	{
		System.out.println(c[i]);
	}
	
}
}