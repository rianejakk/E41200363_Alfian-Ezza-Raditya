package com.testfile.gaskann;

import java.util.Scanner;

public class tugas_statement_data_minavgmax {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);

        System.out.print("Berapa banyak data nilai? ");
        int panjang_array = isi.nextInt();
        int[] nilai = new int[panjang_array];
        double total_nilai = 0;

        for (int i = 0; i < panjang_array; i++) {
            System.out.print("Nilai " + (i + 1) + " : ");
            nilai[i] = (int) isi.nextDouble();
            total_nilai += nilai[i];
        }
        int min = nilai[0]; int max = 0;

        for (int j = 0; j < panjang_array; j++){
            if (min > nilai[j])
                min = nilai[j];
        }
        for (int k = 0; k < panjang_array; k++){
            if (max < nilai[k])
                max = nilai[k];
        }
        double avg = total_nilai / panjang_array;

        System.out.println("\nNilai Minimum   = " + min + "\nNilai Maksimum  = " + max + "\nNilai Rata-Rata = " + avg);
    }
}
