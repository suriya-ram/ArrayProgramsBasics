package BasicPrograms;

public class MaxElement {
public static void main(String[] args) {
	
	
	
	int a[] = {20,90,99,900,81,78};
	
	int max =0;
	
	for(int i =0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max = a[i];
		}
	}
	System.out.println(max);
}
}