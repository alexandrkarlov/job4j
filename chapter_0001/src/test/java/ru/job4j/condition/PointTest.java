package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int inX1 = 2;
        int inY1 = 2;
        int inX2 = 6;
        int inY2 = 4;
        double expected = 4.47;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
