package BasicPrograms;

public class LinearSearch {
public static void main(String[] args) 


{
	int arr[] = {20,30,50,70,190,80,70};
	int key =70;
	boolean isPresent = false;
	
	for(int i=0; i<arr.length; i++)
	{
		if(key== arr[i])
		{ isPresent = true;
			System.out.println("key is found at index "+i);
		}
	}
	
	if(isPresent == false)
		System.out.println("whatever element u r searching that is not available in given array");
	
	
	
}
}
