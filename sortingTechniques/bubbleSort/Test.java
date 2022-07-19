package sortingTechniques.bubbleSort;

import java.util.Scanner;

//Calculate no. of steps to reach a particular floor.

public class Test {
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter Floor Number:");
   int n=scan.nextInt();
   System.out.println("Steps:" + res(n));
   System.out.println("Steps:" + res2(n, 0));
   scan.close();
}

static int res(int n)
{
	int steps=0;
	while(n!=0)
	{
	if(n%2!=0)
		steps = steps+31;
	else
	{
		if(n==6)
			steps=steps+22;
		else
			steps=steps+20+n;
	}
	n--;
	}
	return steps;
}

static int res2(int n, int steps)
{
	if(n==0)
		return steps;
	if(n%2!=0)
		steps = steps+31;
	else
	{
		if(n==6)
			steps=steps+22;
		else
			steps=steps+20+n;
	}
	return res2(--n, steps);
}
}
