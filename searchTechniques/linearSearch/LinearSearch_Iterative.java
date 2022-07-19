package searchTechniques.linearSearch;

import java.util.Scanner;

public class LinearSearch_Iterative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of Array:");
		int n = scan.nextInt();
		
		int[] intArray= new int[n];	
		
	    System.out.println("Enter Array Elements:");
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
				     System.out.println("Index:" + iterativeLinearSearch(intArray, target));
			         break;
			 case 2: System.exit(1);
			         scan.close();
			         break;
			 default: System.out.println("Invalid Choice");
			 }
		}
	
	}
	
	static int iterativeLinearSearch(int[] intArray, int target)
	{
		for(int i=0;i<intArray.length;i++)
		{
			if(intArray[i] == target)
				return i;
		}
		return -1;
	}

}
