package recursion.Array;

import java.util.Scanner;

public class sumofarray {
public static void main(String[] s)
{
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[10];
	System.out.println("Enter the array elements:");
	for(int i=0;i<10;i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Sum: " + sum(arr,0));
	scan.close();
}

static int sum(int arr[], int i)
{
	if(i==10)
	return 0;
	return arr[i] + sum(arr, i+1);	
}
}