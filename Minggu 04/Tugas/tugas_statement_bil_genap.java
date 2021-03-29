package com.testfile.gaskann;

import java.util.Scanner;

public class tugas_statement_bil_genap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                Kode ini menampilkan bilangan genap\s
                dengan batas bilangan akhir sesuai input user.
                Berapa batas angka yang diinginkan?\s""");
        int limit = scan.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
