package recursion.Maths;

import java.util.Scanner;

public class Addsqnum {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the upper range:");
		int n = scan.nextInt();
		int sum = add(1, n);
		System.out.println("Sum: " +sum);
		scan.close();
	}
	
	static int add(int m, int n)
	{
		if(m==n+1)
		return 0;	
		return m*m+ add(m+1,n);
	}
}
