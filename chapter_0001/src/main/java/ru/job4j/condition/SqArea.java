package ru.job4j.condition;

public class SqArea {
    public static double square (int p, int k) {
        return ((p/2-k)*((p/2)-(p/2-k)));
    }
    public static void main (String [] args ) {
        double result1 = square (12,2);
        System.out.println ("Если p = 6, а k = 2, то площадь будет S = " + result1);
    }
}
