package com.testfile.gaskann;

public class Array1d {
    public static void main(String[] args) {

        int[] angka = {5, 10, 17, 20, 1};
        String[] teks = {"Saya", "sedang", "belajar", "OOP", "Java"};

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        for (int j = 0; j < teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
}
