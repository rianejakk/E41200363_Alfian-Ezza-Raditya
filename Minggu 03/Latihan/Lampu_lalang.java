package com.testfile.gaskann;

import java.util.Scanner;

public class Lampu_lalang {
    public static void main(String[] args) {

        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Apa warna lampu? ");
        lampu = scan.next().toLowerCase();

        switch (lampu) {
            case "merah" -> System.out.println("Lampu merah, berhenti.");
            case "kuning" -> System.out.println("Lampu kuning, harap hati-hati.");
            case "hijau" -> System.out.println("Lampu hijau, silahkan jalan.");
            default -> System.out.println("Warna lampu salah.");

        }
    }
}
