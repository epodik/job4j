package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        int result = calc(0);
        System.out.println(result);
    }

    public static int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be > 0");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}