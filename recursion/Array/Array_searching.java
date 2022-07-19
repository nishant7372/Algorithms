package recursion.Array;

import java.util.Scanner;

public class Array_searching {
	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		arr[i] = scan.nextInt();
		while(true)
		{
		System.out.println("\nEnter the target element:");
		int target = scan.nextInt();
		int firstindex = firstIndex(arr, target, 0);
		if(firstindex == -1)
		System.out.println("Element not found");
		else
		System.out.println("First Index: " + firstindex);
		
		int lastindex = lastIndex(arr, target, n-1);
		if(lastindex != -1)
		System.out.println("Last Index: " + lastindex);

		System.out.print("All Indexes: ");
		int occurence = count(arr, target, 0, 0);
		System.out.println("\nOccurence: " + occurence + " times"); 
		System.out.println("\nPress 1 to exit or 0 to continue:");
		int choice = scan.nextInt();
		if(choice==1)
		{
			scan.close();
			System.exit(1);
		}
		}
	} 
	
	static int firstIndex(int[] arr, int target, int i)
	{
		    if(i==arr.length)
		    return -1;
			if(arr[i]==target)
			return i;
			return firstIndex(arr, target, i+1);	
	}
	static int lastIndex(int[] arr, int target, int i)
	{
		    if(i==-1)
		    return -1;
			if(arr[i]==target)
			return i;
			return lastIndex(arr, target, i-1);	
	}

	static int count(int[] arr, int target, int i, int c)
	{
		    if(i==arr.length)
		    return c;
			if(arr[i]==target)
			{
			System.out.print(i +", ");
			c++;
			}
			return count(arr, target, i+1, c);	
	}
}
