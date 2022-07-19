package recursion.Array;

import java.util.Scanner;
//This program converts a number into single digits and store them into an array
public class Store_numdig_in_array {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number:");
			long n = scan.nextLong();
			long c = count(n, 0);
			long[] arr = new long[(int)c];
			System.out.println("Array Elements:");
			store(n,c,arr);
			scan.close();
		}
		static void store(long n, long c, long arr[])
		{
			if(n==0)
			return;
			arr[(int)c-1] = n%10;
			store(n/10, c-1, arr);
			System.out.print(arr[(int)c-1] + " ");
			
		}
		static long count(long n, long c)
		{
			if(n==0)
			return c;
			c++;
			return count(n/10,c);
		}
}
