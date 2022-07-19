package recursion.Maths;
import java.util.Scanner;
public class GCD {
 public static void main(String args[])
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter first number:");
	 int a = scan.nextInt();
	 System.out.println("Enter second number:");
	 int b = scan.nextInt();
	 System.out.println("GCD of " + a + " and " + b + " is: "  + gcd(a,b));
	 scan.close();
 }
 
 static int gcd(int a, int b)
 {
	 if(a==0)
		 return b;
	 if(b==0)
		 return a;
	 if(a==b)
		 return a; //return b is also true
	 if(a>b)
		 return gcd(a-b,b);
	 else
		 return gcd(a,b-a);
		 
 }
}
