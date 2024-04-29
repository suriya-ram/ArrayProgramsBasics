package BasicPrograms;

public class ArrayShifting {
	
	public static void main(String[] args) {
		
	
	int a[] = {10,20,30,40,50,60};
	int temp= a[0];
	int i=0;
	for( i=0; i<a.length-1; i++)
		
	{  
		 
		 a[i] = a[i+1];
	}
	
    a[i] = temp;
    
    for(int j=0; j<a.length; j++)
    	 System.out.print(a[j]+ " ");
}}
