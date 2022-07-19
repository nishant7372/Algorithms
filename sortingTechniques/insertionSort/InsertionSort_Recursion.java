package sortingTechniques.insertionSort;

import java.util.Scanner;

public class InsertionSort_Recursion {

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter size of Array:");
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
		 case 1: sortAscending(intArray, 1);
		         System.out.println("Ascended Sorted Array:");
		         display(intArray);
		         break;
		 case 2: sortDescending(intArray, 1);
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

static void sortAscending(int[] intArray, int firstUnsortedIndex)
{
	if(firstUnsortedIndex>intArray.length-1)
		return;
	int newElement = intArray[firstUnsortedIndex];
	helper(intArray, newElement, firstUnsortedIndex);
	sortAscending(intArray, ++firstUnsortedIndex);
}

static void sortDescending(int[] intArray,int firstUnsortedIndex)
{
	if(firstUnsortedIndex>intArray.length-1)
		return;
	int newElement = intArray[firstUnsortedIndex];
	helper2(intArray, newElement, firstUnsortedIndex);
	sortDescending(intArray, ++firstUnsortedIndex);
}

static void helper(int[] intArray, int newElement, int i)
{
	if(i==0||intArray[i-1]<=newElement)
	{
	intArray[i]	=newElement;
	return; 
	}
	intArray[i]=intArray[i-1];
	
   helper(intArray, newElement, --i);
}

static void helper2(int[] intArray, int newElement, int i)
{
	if(i==0||intArray[i-1]>=newElement)
	{
		intArray[i]	= newElement;
		return; 
	}
	intArray[i]=intArray[i-1];
	
   helper2(intArray, newElement, --i);
}

static void display(int[] intArray)
{
	for(int i=0;i<intArray.length;i++)
    System.out.print(intArray[i] + " ");
	System.out.println("\n");
}
}
