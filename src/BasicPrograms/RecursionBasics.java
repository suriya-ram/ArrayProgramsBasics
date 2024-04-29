package BasicPrograms;

public class RecursionBasics {
	
	
public static void main(String[] args) {
	
	int sum =0;
	int num=1;
	int result =printNos(num,sum);
	System.out.println("addition of five num: " +result);
	 
	int fact =1;
	int result2 =factNo(num,fact);
	System.out.println("factorial num: " +result2);
	
}

private static int factNo(int num, int fact) {
	
	fact=fact*num;
	num++;
	if(num<=5)
		return factNo(num,fact);
	else
		return fact;
	
	
}

private static int printNos(int i, int sum) {
	
	sum=sum+i;
	
	i++;
	if(i<=5)
	 return printNos(i,sum);
	else
	return sum;
}

}
