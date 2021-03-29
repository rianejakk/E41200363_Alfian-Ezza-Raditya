package com.testfile.gaskann;

public class tugas_statement_power0f2 {
    public static void main(String[] args) {
        int num = 1;
        System.out.print("""
                         Do_While
                Bilangan Kelipatan 2 (1-100)
                ============================
                """);
        do {
            System.out.print(num + "   ");
            num = num * 2;
            } while (num < 100);
        }
    }

