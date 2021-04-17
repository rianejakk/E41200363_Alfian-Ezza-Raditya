package com.sorting.yes;

public class Bubble_sort_descending {
    static void bubblesortdescend(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Sebelum Bubble Sort : ");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println("\n");
        bubblesortdescend(arr);
        System.out.println("Array Sesudah Bubble Sort : ");
        for (int j : arr)
            System.out.print(j + " ");
    }
}
