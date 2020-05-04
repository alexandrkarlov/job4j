package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(15, 15);
        Point second = new Point(15, 30);
        Point third = new Point(30, 15);
        Triangle testArea = new Triangle(first, second, third);
        double result = testArea.area();
        double except = 112.5;
        assertThat(result, is(except));
    }
}
