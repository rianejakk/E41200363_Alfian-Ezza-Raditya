package com.testfile.gaskann;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        String grade;
        Scanner scan_nilai = new Scanner(System.in);

        System.out.print("Input Nilai : ");
        int nilai = scan_nilai.nextInt();

        if      (nilai >= 90) grade = "A";
        else if (nilai >= 80) grade = "B+";
        else if (nilai >= 70) grade = "B";
        else if (nilai >= 60) grade = "C+";
        else if (nilai >= 50) grade = "C";
        else if (nilai >= 40) grade = "D";
        else                  grade = "E";

        System.out.println("Grade = " + grade);
    }
}
