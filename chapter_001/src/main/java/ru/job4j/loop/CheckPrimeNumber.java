package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        int num;
        for (num = 2; num < finish; num++){
            if (finish % num ==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}