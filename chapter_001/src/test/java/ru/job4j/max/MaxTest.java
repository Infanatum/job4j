package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenFirstAndSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(5, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstAndThirdLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(4, 9, 5);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondAndThirdLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(5, 1, 3);
        assertThat(result, is(5));
    }
}
