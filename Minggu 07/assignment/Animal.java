package com.clas.assignment;

class binatang {
    public static class Animal {
        public void makeNoise() {
            System.out.println("(talk)");
        }
    }

    static class Dog extends Animal {
        public void makeNoise() {
            System.out.println("Woof");
        }
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animaldog = new Dog();
        animaldog.makeNoise();

        if (animal instanceof Animal)
            System.out.println("animal is Animal");
        if (dog instanceof Animal)
            System.out.println("dog is Animal");
        if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal");
        if (animal instanceof Dog)
            System.out.println("animal is Dog");
    }
}

