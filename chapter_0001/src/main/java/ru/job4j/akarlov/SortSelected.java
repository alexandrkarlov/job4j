package ru.job4j.akarlov;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {

    public static int[] sort(int[] data) {
        for(int forward = 0; forward < data.length-1; forward++) {
            int start = forward;
            int min = MinDiapason.findMin(data,start,data.length - 1);
            int index = FindLoop.indexOf1(data, min, 0, data.length);
                int temp = data[forward];
                data[forward] = data[index];
                data[index] = temp;
        }
        return data;
    }
}