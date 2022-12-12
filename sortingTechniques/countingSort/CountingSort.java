package sortingTechniques.countingSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int n = scan.nextInt();

        int[] intArray= new int[n];

        System.out.println("Enter Array Elements(in btw -> -100000 to 100000):");
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

    private static void sortAscending(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x:arr)
        {
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }
        int[] temp = new int[(-1*min)+max+1];

        for(int x:arr)
        {
            temp[x+(-1*min)]++;
        }
        int k=0;
        for(int i=0;i<temp.length;i++)
        {
            while(temp[i]-->0)
                arr[k++]=i-(-1*min);
        }
    }

    private static void sortDescending(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x:arr)
        {
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }
        int[] temp = new int[(-1*min)+max+1];

        for(int x:arr)
        {
            temp[x+(-1*min)]++;
        }
        int k=0;
        for(int i=temp.length-1;i>=0;i--)
        {
            while(temp[i]-->0)
                arr[k++]=i-(-1*min);
        }
    }

    private static void display(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}
