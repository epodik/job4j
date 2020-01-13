package ru.job4j.sort;
import java.util.Arrays;
public class Merge {


    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        int i = 0;
        if (left.length == 0) {
            rsl = right;
            i = rsl.length;
        }
        if (right.length == 0) {
            rsl = left;
            i = rsl.length;
        }
        boolean leftend = false;
        boolean rightend = false;
        while (i < rsl.length) {
            if ((left[a] <= right[b] || rightend) && !leftend) {
                rsl[i] = left[a];
                if (a == left.length - 1) {
                    leftend = true;
                }
                if (!leftend) {
                    a++;
                }
                i++;
            } else if ((right[b] <= left[a] || leftend) && !rightend) {
                rsl[i] = right[b];
                if (b == right.length - 1) {
                    rightend = true;
                }
                if (!rightend) {
                    b++;
                }
                i++;
            }
        }
        return rsl;
    }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}