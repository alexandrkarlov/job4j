package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class SqAreaTest {
    @Test
            public void square() {
        int inP = 12;
        int inK = 2;
        int expected = 8;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}
