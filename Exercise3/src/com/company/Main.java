package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

/*        String [] names = {"Ann","James","Mike","Fred"};
        SortingUtility.sort(names);
        printArray(names);*/
        int n = 4;
        int k = 3;
//        int[] array = new int[] {1,9, 4, 7, 0, 21, 15};
        String[] names1 = {"Kate", "Nikita", "Nastya", "Alice"};
        String[] names2 = {"Natasha", "Alina", "Artem", "Ilya"};
        String[] names3 = {"Sasha", "Arthur", "Kirill", "Vlad"};
        ArrayList<String[]> nameList = new ArrayList<>();
        nameList.add(names1);
        nameList.add(names2);
        nameList.add(names3);
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of arrays");
        int k = scanner.nextInt();
        System.out.println("Input length of arrays");
        int n = scanner.nextInt();*/
        //get sorted k arrays
//        ArrayList<int[]> sortedArrays = MergeSort.generateSortedArrays(k, n);
        //concatenate first two arrays
//        int[] merge = MergeSort.concatenateArrays(sortedArrays.get(0), sortedArrays.get(1));
        String[] merge = MergeSort.concatenateArrays(nameList.get(0), nameList.get(1));
        //call method sort merge for sorting
        MergeSort.sort(merge, 0, 2 * n - 1);
        System.out.println(Arrays.toString(merge));
        for (int i = 2; i < k; i++) {
            //concatenate result on previous step with i array, where i from 2 to k
            merge = MergeSort.concatenateArrays(merge, nameList.get(i));
            System.out.println(Arrays.toString(merge));
            //call method sort merge with 3-rd, 4-th array, and so on
            MergeSort.sort(merge, 0, (i + 1) * n - 1);
        }
        //print sorted array length k * n
        Arrays.stream(merge).forEach(s -> System.out.print(s + " "));


//        System.out.println(Arrays.toString(array));
        //MergeSort.sort(array, 0, array.length - 1);
        //MergeSort.printArray(array);

    }
/*    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }*/
}
