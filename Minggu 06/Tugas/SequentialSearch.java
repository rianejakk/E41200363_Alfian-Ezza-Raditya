package com.sorting.yes;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] A_variabel = {4, 3, 53, 74, 9, 7, 63};
        int target = 7;

        sqlsearch(A_variabel, target);
    }
    public static void sqlsearch(int[] a, int b) {
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Index yang dicari tidak ada.");
        }
        else {
            System.out.println("Target angka tersebut ada dalam index " + index + " dari array.");
        }
    }
}
