package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight (){
        double in = 184;
        double expected = 96.6;
        double out = Fit.manWeight(in);
        Assert.assertEquals (expected,out,0.01);
        // Почему диапазон не дает сделать погрешность? к примеру выставляю 0.1 и присваиваю expected 96.7. При этом тест выдает ошибку.//
    }
    @Test
    public void womanWeight () {
        double in = 173;
        double expected = 72.44999999999999;
        double out = Fit.womanWeight(in);
        Assert.assertEquals (expected,out,0.01);
    }
}
