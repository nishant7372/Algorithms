package recursion.BaseChange;

import java.util.Scanner;

public class Anybasetodecimal {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n = scan.nextInt();
		System.out.println("Enter the Base(2<=base<=9):");
		int b = scan.nextInt();
		System.out.println("Decimal number: " + convert(n, 0, b));
		scan.close();
	}
	static int convert(int n, int i, int b)
	{
		if(n==0)
		return 0;
		
	    return n%10*(int)Math.pow(b,i) + convert(n/10, i+1, b);
		
	}
}
