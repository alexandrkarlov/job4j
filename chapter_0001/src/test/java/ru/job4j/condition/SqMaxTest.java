package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMoreAll() {
        int result = SqMax.max(5, 4, 3, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whenSecondMoreAll() {
        int result = SqMax.max(4, 5, 2, 1);
        assertThat(result, is(5));
    }
    @Test
    public void whenThirdMoreAll() {
        int result = SqMax.max(5, 4, 8, 7);
        assertThat(result, is(8));
    }
    @Test
    public void whenFourMoreAll() {
        int result = SqMax.max(2, 1, 3, 4);
        assertThat(result, is(4));
    }
}
