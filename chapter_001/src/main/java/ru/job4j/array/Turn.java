package ru.job4j.array;

/**
 * Class Turn is intended to reverse an array.
 *
 * @author Infanatum
 * @version 2
 * @since 01.09.2018
 */
public class Turn {
    /**
     * Reversing an array.
     *
     * @param array Source array.
     * @return Reversed array.
     */
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}