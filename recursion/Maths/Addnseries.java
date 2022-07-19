package recursion.Maths;

import java.util.Scanner;

public class Addnseries {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Series Type: 1^x + 2^x + 3^x + ... + n^x");
		System.out.println("Enter the upper range(n):");
		int n = scan.nextInt();
		System.out.println("Enter the power(x):");
		int x = scan.nextInt();
		int sum = add(1,n,x);
		System.out.println("Sum: " +sum);
		scan.close();
	}
	
	static int add(int m, int n, int x)
	{
		if(m==n+1)
		return 0;	
		return (int)Math.pow(m,x) + add(m+1,n,x);
	}
}
