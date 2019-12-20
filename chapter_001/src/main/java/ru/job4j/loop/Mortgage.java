package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 1;
        amount = amount + amount * percent * 0.01;
        while (amount > salary) {
            amount = amount - salary;
            amount = amount + amount * percent * 0.01;
            year++;
        }
        return year;
    }
}