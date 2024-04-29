package BasicPrograms;

public class TransposeMatrix {
	
	public static void main(String[] args) {
		
	
	int arr[][] = {   {1,2,3},
			           {4,5,6 },
			           {7,8,9}};
	
	int trans[] [] = new int[3][3];
	
	for(int row =0; row<3; row++)
	{
	 for(int col =0; col<3; col++ )
	 {
		 trans[row][col]  = arr[col][row];
	 }
	}
		
	for(int row =0; row<arr.length; row++)
	{
	 for(int col =0; col<arr.length; col++ )
	 {
		 
		  System.out.print(trans[row][col]+" " );
		  
	 }
	 System.out.println( );
	}
	

}
} 