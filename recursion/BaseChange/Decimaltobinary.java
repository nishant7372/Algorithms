package recursion.BaseChange;

import java.util.Scanner;
/*Not valid for many numbers*/
public class Decimaltobinary {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int res = convert(n, 0);
		System.out.println(res);
		scan.close();
	}
	static int convert(int n, int rev)
	{
		if(n==0)
		return rev;
		
		int a = n%2;
		rev = rev*10 +a; 
		int res =  convert(n/2, rev);
		return reverse(res, 0);
		
	}
	static int reverse(int n, int rev)
	{
		if(n==0)
		return rev;
		
		int a = n%10;
		rev = rev*10 +a; 
		return reverse(n/10, rev);
		
	}
}
