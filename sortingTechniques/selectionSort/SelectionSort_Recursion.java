package sortingTechniques.selectionSort;

import java.util.Scanner;

public class SelectionSort_Recursion {

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
	int largest = helper(intArray,lastUnsortedIndex, 1, 0);
	swap(intArray, largest ,lastUnsortedIndex);
	sortAscending(intArray, --lastUnsortedIndex);
}

static void sortDescending(int[] intArray,int lastUnsortedIndex)
{
	if(lastUnsortedIndex<=0)
		return;
	int smallest = helper2(intArray,lastUnsortedIndex, 1, 0);
	swap(intArray, smallest, lastUnsortedIndex);
	sortDescending(intArray, --lastUnsortedIndex);
}

static int helper(int[] intArray, int lastUnsortedIndex, int i, int largest)
{
	if(i>lastUnsortedIndex)
		return largest;
	
	if(intArray[i]>intArray[largest])
	    largest=i;
	
	return helper(intArray, lastUnsortedIndex, i+1, largest);
}

static int helper2(int[] intArray, int lastUnsortedIndex, int i, int smallest)
{
	if(i>lastUnsortedIndex)
		return smallest;
	
	if(intArray[i]<intArray[smallest])
		smallest = i;
	
	return helper2(intArray, lastUnsortedIndex, i+1, smallest);
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
