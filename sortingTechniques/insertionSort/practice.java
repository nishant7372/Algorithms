package sortingTechniques.insertionSort;

import java.util.Scanner;

public class practice {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int n = scan.nextInt();
		
		int[] intArray= new int[n];	
		
	    System.out.println("Enter Array Elements:");
		for(int i=0;i<intArray.length;i++)
		intArray[i] = scan.nextInt();
		
		while(true)
		{
			 System.out.println("\n1. Sort in Ascending Order");
			 System.out.println("2. Sort in Descending Order");
			 System.out.println("3. Exit\n");
			 
			 System.out.print("Enter your Choice:");
			 int ch = scan.nextInt();
			 
			 switch(ch)
			 {
			 case 1: sortAscending(intArray);
			         System.out.println("Ascended Sorted Array:");
			         display(intArray);
			         break;
			 case 2: sortDescending(intArray);
			         System.out.println("Descended Sorted Array:");
	                 display(intArray);
	                 break;
			 case 3: System.exit(1);
			         scan.close();
			         break;
			 default: System.out.println("Invalid Choice");
			 }
		}
	}

	static void sortAscending(int[] intArray)
	{
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++)
		{
			int newElement = intArray[firstUnsortedIndex];
			
			int i;
			
			for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--)
			{
					intArray[i]=intArray[i-1];
			}
			intArray[i]=newElement;
		}
	}

	static void sortDescending(int[] intArray)
	{
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++)
		{
			int newElement = intArray[firstUnsortedIndex];
			
			int i;
			
			for(i=firstUnsortedIndex;i>0 && intArray[i-1]<newElement;i--)
			{
					intArray[i]=intArray[i-1];
			}
			intArray[i]=newElement;
		}
	}
	
	static void display(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
	    System.out.print(intArray[i] + " ");
		System.out.println("\n");
	}
}
