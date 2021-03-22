package com.testfile.gaskann;

import java.util.Scanner;

public class plaza_checkout {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Scanner barang = new Scanner(System.in);

        System.out.print("""
                ______________________________________
                         Kharisma Agung Plaza        \s
                        Promo Belanja Berhadiah      \s
                   Khusus Pembelian 5 Barang Pertama \s
                    Dengan Harga Minimum Rp 10000,00 \s
                ______________________________________
                """);
        System.out.print("Nama Pembeli : ");
        String nama_pembeli = scan.nextLine();
        System.out.print("Jumlah Barang : ");
        int jumlah_barang = barang.nextInt();
        System.out.println();

        int[] harga_barang = new int[jumlah_barang];
        int jumlah_harga = 0;
        for (int i = 0; i < jumlah_barang; i++) {
            System.out.print("Harga Barang " + (i + 1) + " : ");
            harga_barang[i] = barang.nextInt();
            jumlah_harga += harga_barang[i];
        }
        System.out.println("\nTotal pembelian a.n. " + nama_pembeli + " adalah Rp " + jumlah_harga + "\n");

        if (jumlah_barang >= 5) {
            for (int j = 0; j < jumlah_barang; j++) {
                if (harga_barang[j] >= 30000) {
                System.out.println("Selamat, anda mendapatkan hadiah 1 buah mug\n" +
                        "dan 1 piring cantik!");
                break;
                } else if (harga_barang[j] >= 10000) {
                System.out.println("Selamat, anda mendapatkan hadiah 1 buah mug cantik!");
                break;
            }
        }
        }
        System.out.println("""
                ______________________________________\s
                             Terima Kasih\s
                         Anda sudah berbelanja\s
                        di Kharisma Agung Plaza
                """);
    }
}
