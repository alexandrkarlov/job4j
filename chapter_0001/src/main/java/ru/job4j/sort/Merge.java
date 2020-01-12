package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int min;
        int count = 0;
        int j = 0;
        int k = 0;
        while (rsl[rsl.length - 1] == 0) {
            if (k > left.length - 1) {
                min = right[j];
                rsl[count] = min;
                j++;
            } else if (j > right.length - 1) {
                min = left[k];
                rsl[count] = min;
                k++;
            } else if (left[k] < right[j]) {
                min = left[k];
                rsl[count] = min;
                k++;
            } else {
                min = right[j];
                rsl[count] = min;
                j++;
            }
            count++;
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
