package recursion.Maths;

import java.util.Scanner;
// This program print all digits of a number separated by commas
public class Printdigits {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int n = scan.nextInt();
			print(n);
			scan.close();
		}
		static void print(int n)
		{
			if(n==0)
			return;
			
			print(n/10);
	        System.out.print(n%10+", ");
		}
}
