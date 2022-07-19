package recursion.Maths;

import java.util.Scanner;

public class Countdigits {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int ans = count(x,0);
		System.out.println("Digits: " + ans);
		scan.close();
	}

	static int count(int n, int c)
	{
		if(n==0)
		return c;
		c++;
		return count(n/10,c);
	}

}
