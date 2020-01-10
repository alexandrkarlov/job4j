package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. Test result :" + passed);
        int dollar = rubleToDollar(120);
        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are " + dollar + " dollars. Test result :" + passed1);
        int rubleFromEuro = euroToRuble(71);
        int in2 = 71;
        int expected2 = 4970;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("71 euro are " + rubleFromEuro + " rubles. Test result :" + passed2);
        int rubleFromDollar = dollarToRuble(55);
        int in3 = 55;
        int expected3 = 3300;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("55 dollars are " + rubleFromDollar + " rubles. Test result :" + passed3);

    }
}
