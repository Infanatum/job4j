package ru.job4j.array;

/**
 * Class Turn is intended to reverse an array.
 *
 * @author Infanatum
 * @version 1
 * @since 01.09.2018
 */
public class Turn {
    /**
     * Finding the target element in an array.
     *
     * @param array Source array.
     * @return Reversed array.
     */
    public int[] turn(int[] array) {
        /**
         * Reversing an array.
         *
         * @param array Source array.
         * @return Reversed array.
         */
        int middle = array.length / 2;
        int i = 0, j = array.length - 1, temp = 0;

        for (; i < middle; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }
}