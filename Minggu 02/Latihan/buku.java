package com.testfile.gaskann;

class book {
    int price;
    int pages;

    public void set (int price, int pages) {
        this.price =  price;
        this.pages = pages;
    }
    public void show () {
        System.out.println("Books information");
        System.out.println("Books Price : " + price);
        System.out.println("Number of Pages : " + pages);
    }

public static class buku {
    public static void main(String[] args){

        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();

        }
    }
}
