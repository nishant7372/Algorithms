package recursion.Maths;

import java.util.Scanner;

public class SumofDgits {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int ans = sum(x);
		System.out.println("Sum of Digits: " + ans);
		scan.close();
	}

	static int sum(int n)
	{
		if(n==0)
		return 0;
		return n%10 + sum(n/10);
	}

}
