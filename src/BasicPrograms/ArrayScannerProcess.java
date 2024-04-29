package BasicPrograms;

import java.util.Scanner;

public class ArrayScannerProcess {
	public static void main(String[] args)
	
	
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("enter the array length");
		int length = sc.nextInt();
		
		
		int a[] = new int[length];
		//System.out.println("enter the values");
		for(int i =0; i<a.length; i++)
		{
			System.out.println("enter values" );
			 a[i]=sc.nextInt();
			 
		}
		System.out.println("the array values are");
		for(int i =0; i<a.length; i++)
		{
			
			 System.out.print( a[i] );
		}
		
		
		
		
		
		
		
		
		
		
	}

}
