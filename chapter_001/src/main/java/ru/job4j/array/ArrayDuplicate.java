package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate is intended to delete duplicates in the array.
 *
 * @author Infanatum
 * @version 1
 * @since 04.09.2018
 */
public class ArrayDuplicate {
    /**
     * Returns the cropped array without duplicates.
     *
     * @param array Source array.
     * @return Array.
     */
    public String[] remove(String[] array) {
        int counter = array.length;
        for (int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[counter - 1];
                    counter--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, counter);
    }
}