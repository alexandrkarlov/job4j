package ru.job4j.array;

public class Min {
    /**
     * Ищем минимальный елемент в цикле.
     * @param array - некий массив.
     * @return result.
     */
    public static int min(int[] array) {
        int result = array[0];
        for (int index = 0; index < array.length; index++) {
            int min = array[index];
            if (min <= result) {
                result = min;
            }
        }
        return result;
    }
}
