package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for(int index = 0; index < pref.length; index++ ) {
            if(word[index] == pref[index]) {
                result = true;
            }
            else {
                return result = false;
            }
        }
        return result;
    }
}