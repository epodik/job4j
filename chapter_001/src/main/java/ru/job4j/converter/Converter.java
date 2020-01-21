package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int eurotoruble(int value) {
        return value * 70;
    }
    public static int dollartoruble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
        in = 5;
        expected = 300;
        out = dollartoruble(in);
        passed = expected == out;
        System.out.println("5 dollars are 300 rubles. Test result : " + passed);
        in = 5;
        expected = 350;
        out = eurotoruble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 rubles. Test result : " + passed);
    }
}
