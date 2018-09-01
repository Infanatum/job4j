package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasElement5ThenIndex0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasElement9ThenIndex3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{2, 5, 6, 9, 15};
        int value = 9;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNotElement2ThenResultMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{2, 5, 6, 9, 15};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}