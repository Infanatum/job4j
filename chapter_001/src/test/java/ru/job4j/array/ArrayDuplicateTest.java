package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] output = duplicate.remove(input);
        String[] expected = new String[]{"Привет", "Мир", "Супер"};
        assertThat(output, arrayContainingInAnyOrder(expected));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateTwo() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{"Квинтэссенция", "Квинтэссенция", "Квинтэссенция", "Квинтэссенция", "Квинтэссенция"};
        String[] output = duplicate.remove(input);
        String[] expected = new String[]{"Квинтэссенция"};
        assertThat(output, arrayContainingInAnyOrder(expected));
    }
}