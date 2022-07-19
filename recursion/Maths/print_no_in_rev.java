package recursion.Maths;

import java.util.Scanner;

public class print_no_in_rev {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the upper limit of range:");
		int m = scan.nextInt();
		print(m);
		scan.close();
	}
	
	static void print(int m)
	{
		if(m==0)
		{
			return;
		}
		System.out.println(m);
		print(m-1);
	}
}
