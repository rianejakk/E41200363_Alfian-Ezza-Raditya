package com.testfile.gaskann;

import java.util.Scanner;
import java.util.Random;

public class random_array {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode ini meng-generate sebuah array dengan nilai maksimum 100 yang jumlahnya\n" +
                            "dibatasi oleh input angka. Berapa jumlah elemen yang diinginkan? ");

        int limit = scanner.nextInt();
        int[] narray = new int[limit];
        System.out.println();
        System.out.print("Array = {");

        //Jika input == 0 maka hasilnya {}
        if (limit == 0)
            System.out.print("}");

        for (int i = 0; i < narray.length; i++){
            narray[i] = new Random().nextInt(100);
            if (i == narray.length - 1)
                System.out.print(narray[i] + "}");
            else
                System.out.print(narray[i] + ", ");
        }

    }
}
