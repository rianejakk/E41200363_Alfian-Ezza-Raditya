package com.sorting.yes;

public class bnrysrch {
    int binary_search(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binary_search(arr, l, mid - 1, x);
            }
            return binary_search(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        bnrysrch abc = new bnrysrch();
        int[] array = {47, 87, 24, 98, 65, 12, 11, 54, 78};
        int n = array.length;
        int x = 54;
        int hasil = abc.binary_search(array, 0, n - 1, x);
        if (hasil == -1)
            System.out.println("Elemen tidak ditemukan.");
        else
            System.out.println("Elemen " + x + " ditemukan pada index " + hasil);
    }
}
