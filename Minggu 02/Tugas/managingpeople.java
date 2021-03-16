package com.testfile.gaskann;

public class managingpeople {

    public static void main(String[] args) {

        personn p1 = new personn("Alfian", 19);
        personn p2 = new personn("Lina", 25);

        if (p1.getAge()== p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        }
        else{
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
