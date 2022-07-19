package recursion.Maths;

import java.util.Scanner;

public class Table {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Which table you want to print:");
		int m = scan.nextInt();
		print(m,1);
		scan.close();
	}
	
	static void print(int m, int n) 
	{
		if(n==11)
			return;
		else
		{
			System.out.println(m + " x " + n  +" = "+ m*n);
			print(m,n+1);
			
		}
	}
}
