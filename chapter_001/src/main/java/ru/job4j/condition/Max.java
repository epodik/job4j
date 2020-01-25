package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first >= second;
        return condition ? first : second;
    }

    public static int max(int first, int second, int third) {
        boolean condition = first >= max(second, third);
        return condition ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        boolean condition = first >= max(second, third, fourth);
        return condition ? first : max(second, third, fourth);
    }
}