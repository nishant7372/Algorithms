package recursion.Maths;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int ans = rev(x,0);
		if(ans == x)
		System.out.println("Palindrome");
		else
        System.out.println("Not a Palindrome");
		scan.close();
	}

	static int rev(int n,int rev)
	{
		if(n==0)
		return rev;
		rev = rev *10 + n%10;
		return rev(n/10,rev);
	}
}
