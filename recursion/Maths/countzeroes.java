package recursion.Maths;

import java.util.Scanner;

public class countzeroes {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int x = scan.nextInt();
	int ans = count(x,0);
	System.out.println("Zeroes: " + ans);
	scan.close();
}

static int count(int n, int c)
{
	if(n==0)
	return c;
	if(n%10==0)
	c++;
	return count(n/10,c);
}

}
