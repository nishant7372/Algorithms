package recursion.General;

import java.util.Scanner;

public class printmessage {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the message:");
	String s = scan.nextLine();
	System.out.println("Number of times you want to print message:");
	int m = scan.nextInt();
	message(s,1,m);
	scan.close();
}
static void message(String s,int n, int m)
{
	if(n==m+1)
	return;
 System.out.println(n + ":"+ s);
 message(s,n+1,m);
}
}