package com.testfile.gaskann;

public class perbandingan_string {
    public static void main(String[] args){

        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("1) " + s1.compareTo(s2));
        System.out.println("2) " + s2.equals(s3));
        System.out.println("3) " + (s3==s1));
        System.out.println("4) " + s2.compareTo(s3));
        System.out.println("5) " + s3.equals(s1));
    }
}
