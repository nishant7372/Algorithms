package recursion.BaseChange;

import java.util.Scanner;

public class Bitwise_Complement {
public static void main(String[] s)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = scan.nextInt();
	convert(n, 0, 0);
	scan.close();
}

static void convert(int n, int i , int x)
{
	if(n==0)
	return;
	
	convert(n/2, i+1, x);
	int y = complement(n%2);
    x = x + y*(int)Math.pow(10, i);
    if(i==0)
    {
    	int ans = convert2(x, 0);
    	System.out.println("answer:" +ans);
    }
}

static int convert2(int x, int i)
{
	if(x==0)
	return 0;
	
	return (x%10)*(int)Math.pow(2, i) + convert2(x/10, i+1);
	
}

static int complement(int y)
{
	if(y==0)
	return 1;
	
	return 0;
}
}
