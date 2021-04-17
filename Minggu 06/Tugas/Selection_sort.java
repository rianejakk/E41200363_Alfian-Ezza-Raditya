package com.sorting.yes;

public class Selection_sort {
    void selection_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Selection_sort example = new Selection_sort();
        int ini_array[] = {99, 23, 56, 43, 78, 12, 83};
        System.out.println("Array sebelum Selection Sort : ");
        for (int j : ini_array)
            System.out.print(j + " ");
        System.out.println("\n");
        example.selection_sort(ini_array);
        System.out.println("Array setelah Selection Sort : ");
        for (int j : ini_array)
            System.out.print(j + " ");
    }
}

