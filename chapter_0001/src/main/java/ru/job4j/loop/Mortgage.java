package ru.job4j.loop;

public class Mortgage {
    public int year (double amount, double salary, double percent){
        int year = 1;
        double amountRate = (amount * (percent/100));
        double ipoteka = (amount + amountRate);
        while (salary < ipoteka){
            amount = ipoteka - salary;
            amountRate = (amount * (percent/100));
            ipoteka = (amount + amountRate);
                year = year + 1;
        }
        return year;
    }
}
