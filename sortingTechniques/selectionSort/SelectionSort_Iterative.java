package sortingTechniques.selectionSort;

import java.util.Scanner;

public class SelectionSort_Iterative {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of Array:");
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
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--)
		{
			int largest=0;
			for(int i=1; i<=lastUnsortedIndex; i++)
			{
				if(intArray[i]>intArray[largest])
					largest=i;
			}
			swap(intArray, largest ,lastUnsortedIndex);
		}
	}

	static void sortDescending(int[] intArray)
	{
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--)
		{
			int smallest=0;
			for(int i=1; i<=lastUnsortedIndex; i++)
			{
				if(intArray[i]<intArray[smallest])
					smallest=i;
			}
			swap(intArray, smallest, lastUnsortedIndex);
		}
	}

	static void swap(int[] intArray, int i ,int j)
	{
		if(i==j)
		return;
		
		int temp = intArray[i];
		intArray[i]= intArray[j];
		intArray[j] = temp;
	}

	static void display(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
	    System.out.print(intArray[i] + " ");
		System.out.println("\n");
	}
	}
