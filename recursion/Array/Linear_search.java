package recursion.Array;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		arr[i] = scan.nextInt();
		
		System.out.println("Enter the target element:");
		int target = scan.nextInt();
		
		int index = search(arr, target, 0);
		if(index == -1)
		System.out.println("Element not found");
		else
		System.out.println("Index: " + index);
		scan.close();
	} 
	
	static int search(int[] arr, int target, int i)
	{
		    if(i==arr.length)
		    return -1;
			if(arr[i]==target)
			return i;
			return search(arr, target, i+1);	
	}
}
