package ru.job4j.tracker;

public class Animal {
    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Bob");
        Tiger tigerNoname = new Tiger();
    }
}
