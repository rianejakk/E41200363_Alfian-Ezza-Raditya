package com.testfile.gaskann;
import java.util.Scanner;

public class prak_scanner {
    public static void main(String[] args){

    Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan nilai 1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int nilai2 = s1.nextInt();

        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
