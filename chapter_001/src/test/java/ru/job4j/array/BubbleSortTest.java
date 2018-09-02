package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    @Test
    public void whenArray51273ThenArray12357() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{5, 1, 2, 7, 3};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{1, 2, 3, 5, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArray93542ThenArray23459() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{9, 3, 5, 4, 2};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{2, 3, 4, 5, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenArray54321ThenArray12345() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}