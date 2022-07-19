package sortingTechniques.bubbleSort;

import java.util.Scanner;

public class BubbleSort_Recursion {

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
		 case 1: sortAscending(intArray, intArray.length-1);
		         System.out.println("Ascended Sorted Array:");
		         display(intArray);
		         break;
		 case 2: sortDescending(intArray, intArray.length-1);
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

static void sortAscending(int[] intArray, int lastUnsortedIndex)
{
	if(lastUnsortedIndex<=0)
		return;
	helper(intArray,lastUnsortedIndex, 0);
	sortAscending(intArray, --lastUnsortedIndex);
}

static void sortDescending(int[] intArray,int lastUnsortedIndex)
{
	if(lastUnsortedIndex<=0)
		return;
	helper2(intArray,lastUnsortedIndex, 0);
	sortDescending(intArray, --lastUnsortedIndex);
}

static void helper(int[] intArray, int lastUnsortedIndex, int i)
{
	if(i>=lastUnsortedIndex)
		return;
	
	if(intArray[i]>intArray[i+1])
	    swap(intArray, i ,i+1);
	
	helper(intArray, lastUnsortedIndex, i+1);
}

static void helper2(int[] intArray, int lastUnsortedIndex, int i)
{
	if(i>=lastUnsortedIndex)
		return;
	
	if(intArray[i]<intArray[i+1])
	    swap(intArray, i ,i+1);
	
	helper2(intArray, lastUnsortedIndex, i+1);
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
