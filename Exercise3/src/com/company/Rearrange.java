package com.company;

import java.util.Arrays;

public class Rearrange {
    public static void rearrangement(){
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        for (int i = 0; i < arr.length;) {
            if (arr[i] >= 0 && arr[i] != i) {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


