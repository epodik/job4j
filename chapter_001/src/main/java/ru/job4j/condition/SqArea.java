package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k) {
        int h = p / (2*k + 2);
        int w = k * h;
        return w * h;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
