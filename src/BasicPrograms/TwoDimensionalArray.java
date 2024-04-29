
package BasicPrograms;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
	
	int arr[][]= new int [3][3];
	
	
	int row=0;
	
	int value=5;
	while(row<3)
		
	{
		int col =0;
		while(col<3)
		{
			arr[row][col] = value;
			value++;
			col++;
		}
		row++;

	}
	int total =0;
	for(int i=0;i<3; i++)
	{
		
	 for(int j =0;j<3;j++) {
		 if(i==j)
		 total = total + arr[i][j];
		 
	System.out.print(arr[i][j]+ " ");
	 }
	 System.out.println( );
	
	} System.out.println("diagonal total  " +total);
	
}}
