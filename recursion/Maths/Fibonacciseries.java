package recursion.Maths;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] s)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of terms:");
		int m = scan.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=1; i<=m; i++)
		System.out.print(fibo(i-1) + ", ");
		System.out.print("...");
		scan.close();
		
	}

	static int fibo(int n)
	{
		if(n<2)
		{
		return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
}
