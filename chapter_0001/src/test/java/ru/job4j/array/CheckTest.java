/**
 * Не понял что от меня требуется в этих пунктах и как работает 6 пункт.
 * 5. В классе CheckTest напишите 2 тест-метода, которые будут проверять вашу программу для чётного и нечётного количества элементов в массиве.
 * 6. В тестах можно сразу проверять целиком массив через метод assertThat(resultArray, is(expectArray)).
 */

package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
