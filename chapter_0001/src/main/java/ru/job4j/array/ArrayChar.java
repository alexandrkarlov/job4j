package ru.job4j.array;

public class ArrayChar {
    /**
     * Сравниваем эллементы в двух массивах.
     * @param word - длинна сравниваемого массива.
     * @param pref - длинна основного массива.
     * @return result.
     */

    public static boolean starts(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
            }
        }
        return result;
    }
}