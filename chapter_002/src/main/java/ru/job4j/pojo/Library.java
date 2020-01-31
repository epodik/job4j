package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book math = new Book("Math", 100);
        Book book = new Book("Clean code", 200);
        Book history = new Book("History", 500);
        Book java = new Book("Java rulez", 300);
        Book[] library = new Book[4];
        library[0] = math;
        library[1] = book;
        library[2] = history;
        library[3] = java;
        for (int index = 0; index != library.length; index++) {
            Book lb = library[index];
            System.out.println(lb.getName() + " - " + lb.getPages() + " pages");
        }
        Book temp = library[3];
        library[3] = library[0];
        library[0] = temp;
        System.out.println("after replace");
        for (int index = 0; index != library.length; index++) {
            Book lb = library[index];
            System.out.println(lb.getName() + " - " + lb.getPages() + " pages");
        }
        System.out.println("only clean code");
        for (int index = 0; index != library.length; index++) {
            Book lb = library[index];
            if (lb.getName().equals("Clean code")) {
                System.out.println(lb.getName() + " - " + lb.getPages() + " pages");
            }
        }
    }
}
