package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorTest {
    @Test
    public void rubleToEuro () {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro (in);
        Assert.assertEquals (expected, out);
    }
    @Test
    public void rebleToDollar () {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals (expected,out);
    }
    @Test
    public void euroToRuble () {
        int in = 71;
        int expected = 4970;
        int out = Converter.euroToRuble (in);
        Assert.assertEquals (expected,out);
    }
    @Test
    public void dollarToRuble () {
        int in = 55;
        int expected = 3300;
        int out = Converter.dollarToRuble (in);
        Assert.assertEquals (expected,out);
    }
}
