package ru.job4j.condition;

public class SqArea1 {
    public static int square1(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
}