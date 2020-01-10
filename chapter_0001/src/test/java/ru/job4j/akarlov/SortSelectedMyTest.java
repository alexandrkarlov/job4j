package ru.job4j.akarlov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedMyTest {
    @Test
    public void whenArray5Numbers() {
        assertThat(SortSelectedMy.sort(
                new int[] {3, 4, 1, 2, 5}),
                is(new int[] {1, 2, 3, 4, 5})
        );
    }
    @Test
    public void whenArray3Numbers() {
        assertThat(SortSelectedMy.sort(
                new int[] {3, 4, 1}),
                is(new int[] {1, 3, 4})
        );
    }
}
