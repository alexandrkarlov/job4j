package ru.job4j.calculator;

public class Fit {

    public static double manWeight (double haight) {
        return (haight - 100) * 1.15;
    }
    public static double womanWeight (double haight) {
        return (haight - 110) * 1.15;
    }
    public static void main (String[] args){
     double man = manWeight (184);
     System.out.println ("Man 184 is " + man);
     double woman = womanWeight (172);
     System.out.println ("Woman 173 is " + woman);
    }
}
