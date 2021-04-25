package com.clas.inheritence;

public class Orang {
    private String nama;
    private double tinggi;
    private double berat;

    public Orang (String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String toString() {
        return ("Nama : " + nama + "\nTinggi : " + tinggi + "\nBerat : " + berat);
    }
}

class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai;

    public Pelajar(String nama, double tinggi, double berat, String nim, String asalSekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nSekolah : " + asalSekolah + "\nNilai : " + nilai);
    }
}
class Test {
    public static void main(String[] args) {
        Pelajar mahasiswa = new Pelajar("Alfian", 170, 45, "E41200363", "Poltek Jember", 89.5);
        System.out.println(mahasiswa.toString());
    }
}