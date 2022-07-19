package recursion.General;
/*package recursion;

import java.util.Scanner;

public class Stringreplace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String s = scan.next();
		replace(s, 0);	
	}
	
	static void replace(String s, int i)
	{
		int len=s.length;
		if (s[len-2]!='p'&& s[len-1]!='i')	
			return;
		if(s[i]=='p' && s[i+1]=='i')
		{
			s[i] = '3';
		    s[i+1] = '.';
		for(int n= len-1; n>i+1; n--)
			s[n] = s[n+2];
		s[i+2] = '1';
	    s[i+3] = '4';
		}
		replace(s, i+1);
		
		if(i!=0)
		return;
		
		for(i=0;i<s.length;i++)
		System.out.print(s[i]);
		}
}
*/