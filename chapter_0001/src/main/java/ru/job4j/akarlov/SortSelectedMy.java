package ru.job4j.akarlov;

public class SortSelectedMy {
    public static int[] sort(int[] data) {
        for (int forward = 0; forward < data.length; forward++) {
            for (int index = forward; index < data.length; index++) {
                int min = data[forward];
                if (min > data[index]) {
                    int perm = forward;
                    min = data[index];
                    int temp = data[perm];
                    data[perm] = data[index];
                    data[index] = temp;
                }
            }
        }
        return data;
    }
}
