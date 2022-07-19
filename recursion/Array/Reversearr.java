package recursion.Array;

import java.util.Scanner;

public class Reversearr {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the no. of elements:");
			int n = scan.nextInt();
			
			int[] arr = new int[n];
			
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++)
			arr[i] = scan.nextInt();
			
			reverse(arr,0,n-1);	
			for(int i=0;i<n;i++)
			System.out.print(arr[i]+ " ");
			scan.close();
		}
		
		static void reverse(int arr[],int i,int n)
		{
			if(i==n||i>n)
			return;
			
			int temp= arr[i];
			arr[i]=arr[n];
			arr[n] = temp;
			
			reverse(arr,i+1,n-1);
			}
}
