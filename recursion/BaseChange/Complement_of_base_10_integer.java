package recursion.BaseChange;

import java.util.Scanner;
import java.util.ArrayList;

public class Complement_of_base_10_integer {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scan.nextInt();
	        if(n==0)
	        System.out.println("1's Complement: 1");
	    ArrayList<Integer> a= new ArrayList<Integer>();
	    convert(a, n);
	     int res = convert2(a);
	     System.out.println("1's Complement: "+res);
	     scan.close();
		}
		static void convert(ArrayList<Integer> a, int n)
		{
			if(n==0)
			return;
			
			convert(a, n/2);
	        int i = n%2;
	         a.add(i);
		}
	    
		static int convert2(ArrayList<Integer> a)
		{
	        int num=0;
			for(int i=0;i<a.size();i++)
	        {
	            if(a.get(i)==0)
	                a.set(i,1);
	             else if(a.get(i)==1)
	               a.set(i,0);
	        num = num + a.get(i)*(int)Math.pow(2,a.size()-i-1);
	        }
	        return num;
		}
	}