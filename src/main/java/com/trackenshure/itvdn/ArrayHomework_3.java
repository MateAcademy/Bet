package com.trackenshure.itvdn;

import java.util.Arrays;

public class ArrayHomework_3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};

        arr = Arrays.copyOf(arr, 15);
        System.out.println(Arrays.toString(arr));

    }
}