package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]){
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}