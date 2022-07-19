package recursion.BaseChange;

import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Binary number:");
		int n = scan.nextInt();
		System.out.println("Decimal number: " + convert(n, 0));
		scan.close();
		
	}
	static int convert(int n, int i)
	{
		if(n==0)
		return 0;
		
	    return n%10*(int)Math.pow(2,i) + convert(n/10, i+1);
		
	}
}
