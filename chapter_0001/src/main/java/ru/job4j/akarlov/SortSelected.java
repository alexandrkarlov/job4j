package ru.job4j.akarlov;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoop.indexOf1(data, min, 0, data.length);
        for(int forward = 0; forward < data.length-1; forward++) {
                int temp = data[forward];
                data[forward] = data[index];
                data[index] = temp;
                int start = forward + 1;
                min = MinDiapason.findMin(data,start,data.length - 1);
            index = FindLoop.indexOf1(data, min, 0, data.length);
        }
        return data;
    }
}