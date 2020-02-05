package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        System.out.println("Игра 11 спичек");
        while (run) {
            System.out.print("Сколько спичек забрать? (1-3) : ");
            int answer = Integer.valueOf(input.nextLine());
            if (answer < 1 || answer > 3 || matches - answer < 0) {
                System.out.println("Недопустимое число");
            } else {
                matches = matches - answer;
            }
            if (matches == 0) {
                System.out.println("Конец игры");
                run = false;
            } else {
                System.out.println("Осталось " + matches + " спичек");
            }
        }
    }
}
