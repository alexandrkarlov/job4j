package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int result = array[0];
        for(int index = 0; index < array.length; index++) {
            int min = array[index];
            if(min <= result) {
                result = min;
            }
        }
        return result;
    }
}
