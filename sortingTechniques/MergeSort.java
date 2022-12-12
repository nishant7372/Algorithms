package sortingTechniques.mergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();

        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int l,int r)
    {
        if(r-l<1)
            return;
        int m = (l+r)/2;

        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }


    private static void merge(int[] arr,int l,int m,int r)
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


}
