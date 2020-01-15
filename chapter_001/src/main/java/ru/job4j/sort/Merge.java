package ru.job4j.sort;
import java.util.Arrays;
public class Merge {


    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        int i = 0;
        boolean leftend = left.length == 0;
        boolean rightend = right.length == 0;
        while (i < rsl.length) {
            if (leftend) {
                rsl[i++] = right[b++];
            } else if (rightend) {
                rsl[i++] = left[a++];
            } else if (left[a] <= right[b]) {
                rsl[i++] = left[a];
                if (a == left.length - 1) {
                    leftend = true;
                } else {
                    a++;
                }
            } else if (right[b] <= left[a]) {
                rsl[i++] = right[b];
                if (b == right.length - 1) {
                    rightend = true;
                } else {
                    b++;
                }
            }
        }
        return rsl;
    }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {5, 6},
                new int[] {1, 2}
        );
        System.out.println(Arrays.toString(rsl));
    }
}