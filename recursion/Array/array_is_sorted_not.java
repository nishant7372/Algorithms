package recursion.Array;

import java.util.Scanner;

public class array_is_sorted_not {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		arr[i] = scan.nextInt();
		
		boolean b = sort(arr,0);
		System.out.println("Array is sorted: " + b);
		scan.close();
	}
	
	static boolean sort(int[] arr, int i)
	{
		    if(i==arr.length-1)
		    return true;
			if(arr[i]>arr[i+1])
			return false;
			return sort(arr, i+1);	
		}
	}

