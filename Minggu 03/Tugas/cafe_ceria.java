package com.testfile.gaskann;

import java.util.Scanner;

public class cafe_ceria {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("""
                        Cafe Ceria
                       Aneka Minuman
                -----------------------------\s
                    Special Menu
                        1. Soft Drink
                        2. Mixed Juice
                        3. Nescafe
                        4. Soda Milk
                        5. Tea
                -----------------------------\s 
                """);

        System.out.print("Nama Pembeli : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan pilihan anda : ");
        byte pilihan = scan.nextByte();

        switch (pilihan) {
            case 1 -> System.out.println("Pesanan anda adalah Soft Drink.");
            case 2 -> System.out.println("Pesanan anda adalah Mixed Juice.");
            case 3 -> System.out.println("Pesanan anda adalah Nescafe.");
            case 4 -> System.out.println("Pesanan anda adalah Soda Milk.");
            case 5 -> System.out.println("Pesanan anda adalah Tea.");
            default -> System.out.println("Pesanan tidak tersedia.");
        }
        if (pilihan < 6 && pilihan > 0) {
        System.out.println("\nPesanan akan segera kami antar\n" +
                            "Terimakasih " + nama + " telah berkunjung di Cafe Ceria");
        }
    }
}
