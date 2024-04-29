package BasicPrograms;

public class JaggedArray {
	public static void main(String[] args) {
		
	
	int marks[][]= new int [4][];
	System.out.println(marks.length);
	
	
	marks[0] = new int[3];
	marks[1] = new int[4];
	marks[2] = new int[5];
	marks[3] = new int[3];
	
	

	int row =0;
	int value=1;
	while(row<marks.length)
	{
		int col =0;
		while(col<marks[row].length)
		{
		
			marks[row][col] = value;
			value++;
			col++;
		}
		System.out.println("length of each column:  " +marks[row].length);
		row++;
	}
	  
	
	
	
}}
