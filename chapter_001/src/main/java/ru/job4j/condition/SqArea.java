package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h;
        h = p/(2*k+1);
        return h*h*k;
    }

    public static void main(String[] args) {
        double result1 = square(50, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}