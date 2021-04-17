package com.sorting.yes;

public class Bubble_sort {
    static void bubblesort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble Sort : ");
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
        bubblesort(arr);
        System.out.println("Array After Bubble Sort : ");
        for (int j : arr)
            System.out.print(j + " ");
    }
}
