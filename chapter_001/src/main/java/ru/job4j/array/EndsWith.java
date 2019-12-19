package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordindex = word.length-1;
        for (int index = post.length-1; index >=0; index--){
            if (post[index] != word[wordindex]){
             result = false;
             break;
            }
            wordindex--;
        }
        return result;
    }
}