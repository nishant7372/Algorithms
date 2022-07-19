package recursion.BaseChange;

import java.util.Scanner;

public class DecimaltoOctal {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		convert(n);
		scan.close();
	}
	static void convert(int n)
	{
		if(n==0)
		return;
		
		convert(n/8);
        System.out.print(n%8);
		
	}
}
