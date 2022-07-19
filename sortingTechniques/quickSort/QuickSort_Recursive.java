package sortingTechniques.quickSort;

import java.util.Scanner;
//using first element as pivot
public class QuickSort_Recursive {

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
		 case 1: quickSort_Ascending(intArray, 0, intArray.length);
		         System.out.println("Ascended Sorted Array:");
		         display(intArray);
		         break;
		 case 2: quickSort_Descending(intArray, 0, intArray.length);
                 System.out.println("Ascended Sorted Array:");
                 display(intArray);
                 break;
		 case 3: System.exit(1);
		         scan.close();
		         break;
		 default: System.out.println("Invalid Choice");
		 }
	}
}

static void quickSort_Ascending(int[] intArray, int start, int end)
{
	if(end-start<2)
		return;
	
	int pivotIndex = partition_Ascending(intArray, start, end);
	
	quickSort_Ascending(intArray, start, pivotIndex);
	quickSort_Ascending(intArray, pivotIndex+1, end);
}

static int partition_Ascending(int[] intArray, int start, int end)
{
	int pivot= intArray[start];
    int i=start;
    int j=end;
  
    while(i<j)
    {   	
    	while(i<j && intArray[--j]>=pivot);
    	if(i<j)
    	{
    		intArray[i]=intArray[j];
    	}
    	while(i<j && intArray[++i]<=pivot);
    	if(i<j)
    	{
    		intArray[j] = intArray[i];
    	}
    }
    
    intArray[j] = pivot;
    return j;
}

static void quickSort_Descending(int[] intArray, int start, int end)
{
	if(end-start<2)
		return;
	
	int pivotIndex = partition_Descending(intArray, start, end);
	
	quickSort_Descending(intArray, start, pivotIndex);
	quickSort_Descending(intArray, pivotIndex+1, end);
}

static int partition_Descending(int[] intArray, int start, int end)
{
	int pivot= intArray[start];
    int i=start;
    int j=end;
    
    while(i<j)
    {
    	while(i<j && intArray[--j]<=pivot);
    	if(i<j)
    	{
    		intArray[i]=intArray[j];
    	}
    	
    	while(i<j && intArray[++i]>=pivot);
    	if(i<j)
    	{
    		intArray[j] = intArray[i];
    	}
    }
    
    intArray[j] = pivot;
    return j;
}

static void display(int[] intArray)
{
	for(int i=0;i<intArray.length;i++)
    System.out.print(intArray[i] + " ");
	System.out.println("\n");
}
}
