package recursion.Array;

import java.util.Scanner;

public class Deletearray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
		
		delete(arr,0);	
		scan.close();
	}
	
	static void delete(int arr[],int i)
	{
		if(i==arr.length)
		return;
		
		arr[i] = 0;
		delete(arr,i+1);
		
		if(i!=0)
		return;
		
		for(i=0;i<arr.length;i++)
		System.out.print(arr[i]+ " ");
		}
}
