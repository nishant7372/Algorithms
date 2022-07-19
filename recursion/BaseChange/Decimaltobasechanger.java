package recursion.BaseChange;

import java.util.Scanner;

public class Decimaltobasechanger {
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = scan.nextInt();
			System.out.println("Enter the base(2<=base<=9):");
			int b = scan.nextInt();
			convert(n,b);
			scan.close();
		}
		static void convert(int n,int b)
		{
			if(n==0)
			return;
			
			convert(n/b, b);
	        System.out.print(n%b);	
		}
}
