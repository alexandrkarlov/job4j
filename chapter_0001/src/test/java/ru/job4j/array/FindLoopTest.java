package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5,10,3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas10Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5,10,3};
        int result = find.indexOf(input, 10);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5,2,10,2,4};
        int result = find.indexOf1(input,2, 2, 4);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind7() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5,2,10,2,4};
        int result = find.indexOf1(input,7, 2, 4);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
