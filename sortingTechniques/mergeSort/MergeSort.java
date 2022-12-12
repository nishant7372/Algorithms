package sortingTechniques.mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
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
                case 1: sortAscending_mergeSort(intArray,0,n-1);
                    System.out.println("Ascended Sorted Array:");
                    display(intArray);
                    break;
                case 2: sortDescending_mergeSort(intArray,0,n-1);
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

    private static void sortAscending_mergeSort(int[] arr,int l,int r)
    {
        if(r-l<1)
            return;
        int m = (l+r)/2;

        sortAscending_mergeSort(arr,l,m);
        sortAscending_mergeSort(arr,m+1,r);
        sortAscending_merge(arr,l,m,r);
    }


    private static void sortAscending_merge(int[] arr,int l,int m,int r)
    {
        int[] temp = new int[r-l+1];

        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r) {
            if (arr[i] > arr[j])
                temp[k++] = arr[j++];
            else
                temp[k++] = arr[i++];
        }

        while(i<=m)
            temp[k++]=arr[i++];
        while(j<=r)
            temp[k++]=arr[j++];

        k=0;
        for(int idx=l;idx<=r;idx++)
        {
            arr[idx]=temp[k++];
        }
    }

    private static void sortDescending_mergeSort(int[] arr,int l,int r)
    {
        if(r-l<1)
            return;
        int m = (l+r)/2;

        sortDescending_mergeSort(arr,l,m);
        sortDescending_mergeSort(arr,m+1,r);
        sortDescending_merge(arr,l,m,r);
    }


    private static void sortDescending_merge(int[] arr,int l,int m,int r)
    {
        int[] temp = new int[r-l+1];

        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r) {
            if (arr[i] < arr[j])
                temp[k++] = arr[j++];
            else
                temp[k++] = arr[i++];
        }

        while(i<=m)
            temp[k++]=arr[i++];
        while(j<=r)
            temp[k++]=arr[j++];

        k=0;
        for(int idx=l;idx<=r;idx++)
        {
            arr[idx]=temp[k++];
        }
    }
    private static void display(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

}
