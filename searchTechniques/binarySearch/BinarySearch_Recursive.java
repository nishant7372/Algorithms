package searchTechniques.binarySearch;

import java.util.Scanner;

public class BinarySearch_Recursive {

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
				     System.out.println("Index:" + recursiveBinarySearch(intArray, target, 0, intArray.length));
			         break;
			 case 2: System.exit(1);
			         scan.close();
			         break;
			 default: System.out.println("Invalid Choice");
			 }
		}
	}
	
	static int recursiveBinarySearch(int[] intArray, int target, int start, int end)
	{
		int midpoint = (start+end)/2;
		if(start>=end)
			return -1;
		
		if(intArray[midpoint]==target)
			return midpoint;

		else if(intArray[midpoint]<target)
			return recursiveBinarySearch(intArray, target, midpoint+1, end);
		
		else 
		    return recursiveBinarySearch(intArray, target, start, midpoint);
	}

}
