package recursion.Array;

import java.util.Scanner;

public class Repeat_loc_of_element {
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
		
		System.out.print("Indexes: ");
		int occurence = count(arr, target, 0, 0);
		System.out.println("...........Occurence: " + occurence);
		scan.close();
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
