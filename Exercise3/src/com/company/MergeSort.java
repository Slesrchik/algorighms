package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MergeSort {
   static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void merge(String arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        String L[] = new String[n1];
        String R[] = new String[n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j]) < 0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
   static void sort(int[] arr, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void sort(String[] arr, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    /**
     * @param k - number of arrays
     * @param n - length of k -th array
     * @return list k sorted arrays
     */
    public static ArrayList<int[]> generateSortedArrays(int k, int n) {
        ArrayList<int[]> sortedArrays = new ArrayList<int[]>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < k; i++) {
            int[] array = new int[n];
            System.out.println("Input number of " + (i + 1) + " array");
            for (int j = 0; j < n; j++) {
//                array[j] = (int) ((Math.random() * 100)) + 1;
                array[j] = scanner.nextInt();
            }
            //sort array
            Arrays.sort(array);
            //add sorted array to list
            sortedArrays.add(array);
        }
        return sortedArrays;
    }


    /**
     * @param firstArray - first array
     * @param secondArray - second array
     * @return concatenated array
     */
    public static int[] concatenateArrays(int[] firstArray, int[] secondArray) {
        int[] concatenatedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, concatenatedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, concatenatedArray, firstArray.length, secondArray.length);
        return concatenatedArray;
    }

    public static String[] concatenateArrays(String[] first, String[] second)
    {
        return Stream.of(first, second)
                .flatMap(Stream::of)		// or Arrays::stream
                .toArray(String[]::new);
    }

    // Driver method
   /* public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }*/
}

