package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;
    public Triangle(Point ab, Point ac, Point bc) {
        this.first = ab;
        this.second = ac;
        this.third = bc;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public double area() {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a,b,c);
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }

    private boolean exist(double a, double c, double b) {
        a = first.distance(second);
        b = first.distance(third);
        c = second.distance(third);
        if((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        } else {
            return false;
        }
    }
}