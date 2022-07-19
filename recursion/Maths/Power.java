package recursion.Maths;

import java.util.Scanner;

public class Power {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int m = scan.nextInt();
	System.out.println("Enter the power:");
	int n = scan.nextInt();
	System.out.println("Result:" + pow(m,n));
	scan.close();
}
static int pow(int m, int n)
{
	if(n==0)
	return 1;
	else
    return m*pow(m, n-1);
}
}
