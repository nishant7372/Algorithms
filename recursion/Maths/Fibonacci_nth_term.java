package recursion.Maths;

import java.util.Scanner;
//Fibonacci Series starts with 0th term
// 0 1 1 2 3 5 8 13 21 34 55 -  fibo(n);
// 0 1 2 3 4 5 6 7  8  9  10 -  n
public class Fibonacci_nth_term {
public static void main(String[] s)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the term:");
	int m = scan.nextInt();
	int ans = fibo(m);
	System.out.println(m + "th term is: " + ans);
	scan.close();
}

static int fibo(int n)
{
	if(n<2)
	{
	return n;
	}
	return fibo(n-1) + fibo(n-2);
}
}
