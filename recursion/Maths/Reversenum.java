package recursion.Maths;

import java.util.Scanner;

public class Reversenum {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int ans = rev(x,0);
		System.out.println("Reverse number: " + ans);
		scan.close();
	}

	static int rev(int n,int rev)
	{
		int r;
		if(n==0)
		return rev;
		r=n%10;
		rev = rev *10 + r;
		return rev(n/10,rev);
	}

}
