package com.testfile.gaskann;

public class person {

    String fName, lName, stuId, stuStatus;

    public person (String fName, String lName, String stuId, String stuStatus) {

        this.fName = fName;        this.stuId = stuId;
        this.lName = lName;        this.stuStatus = stuStatus;
    }
    public static void main(String[] args) {

        person alfian = new person("Alfian Ezza", "Raditya", "123456789", "Active");
        person lisa = new person("Lisa", "Palambo", "123456789", "Active");

        System.out.println("Nama         = " + alfian.fName + " " + alfian.lName +
                            "\nID Mahasiswa = " + alfian.stuId +
                            "\nStatus       = " + alfian.stuStatus);

        System.out.println("\nNama         = " + lisa.fName + " " + lisa.lName +
                            "\nID Mahasiswa = " + lisa.stuId +
                            "\nStatus       = " + lisa.stuStatus);

    }
}
