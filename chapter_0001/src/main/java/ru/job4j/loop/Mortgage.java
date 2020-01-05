package ru.job4j.loop;

public class Mortgage {
    public int year (double amount, double salary, double percent){
        int year = 1;
        double percentToNumber = percent/100;
        double amountRate = amount * percentToNumber;
        double ipoteka = (amount + amountRate);
        while (salary < ipoteka){
            amount = ipoteka - salary;
            amountRate = amount * percentToNumber;
            ipoteka = (amount + amountRate);
                year++;
        }
        return year;
    }
}
