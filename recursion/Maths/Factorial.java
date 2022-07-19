package recursion.Maths;

import java.util.Scanner;

public class Factorial {
public static void main(String[] s)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int m = scan.nextInt();
	if(m<0)
    System.out.println("Invalid");
	else
	{
	long ans = fact(m);
	System.out.println("Answer:" + ans);
	}
	scan.close();
}

static long fact(int n)
{
	if(n==0)
	return 1;
	else
	{
		return n * fact(n-1);
	}
}
}
