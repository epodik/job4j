package ru.job4j.calculator;

/**
 * Class Калькулятор для вычисления арифметических операций + - * /
 * @author Evgeny Podobny
 * @since 4.12.19
 * @version 1
 */

    public class Calculator {

        public static void add(double first, double second) {
            double result =  first + second;
            System.out.println(first + "+" + second + " = " + result);
        }
        public static void div(double first, double second) {
            double result =  first / second;
            System.out.println(first + "/" + second + " = " + result);
        }
        public static void multiply(double first, double second) {
            double result =  first * second;
            System.out.println(first + "*" + second + " = " + result);
        }
        public static void subtrack(double first, double second) {
            double result =  first - second;
            System.out.println(first + "-" + second + " = " + result);
        }

    /**
     * method main
     * @param args - args
     */
        public static void main(String[] args) {
            add(1, 1);
            div(4, 2);
            multiply(2, 1);
            subtrack(10, 5);
        }
}
