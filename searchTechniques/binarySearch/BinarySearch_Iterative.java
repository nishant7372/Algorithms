package searchTechniques.binarySearch;

import java.util.Scanner;

public class BinarySearch_Iterative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of Array:");
		int n = scan.nextInt();
		
		int[] intArray= new int[n];	
		
	    System.out.println("Enter Array Elements in Sorted Order:");
		for(int i=0;i<intArray.length;i++)
		intArray[i] = scan.nextInt();
		
		while(true)
		{
			 System.out.println("\n1. Search");
			 System.out.println("2. Exit\n");
			 
			 System.out.print("Enter your Choice:");
			 int ch = scan.nextInt();
			 
			 switch(ch)
			 {
			 case 1: System.out.print("Enter the target element:");
			         int target = scan.nextInt();
				     System.out.println("Index:" + iterativeBinarySearch(intArray, target));
			         break;
			 case 2: System.exit(1);
			         scan.close();
			         break;
			 default: System.out.println("Invalid Choice");
			 }
		}
	
	}
	
	static int iterativeBinarySearch(int[] intArray, int target)
	{
		int start=0;
		int end=intArray.length;
		while(start<end)
		{
			int midpoint=(start+end)/2;
			if(intArray[midpoint]==target)
				return midpoint;
			else if(intArray[midpoint]>target)
				end = midpoint;
			else
				start=midpoint+1;
		}
		return -1;
	}

}
