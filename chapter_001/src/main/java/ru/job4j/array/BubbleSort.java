package ru.job4j.array;

/**
 * Class BubbleSort is intended to sort the array using Bubble Sort algorithm.
 *
 * @author Infanatum
 * @version 1
 * @since 02.09.2018
 */
public class BubbleSort {
    /**
     * Sorting the array using Bubble Sort algorithm.
     *
     * @param array Source array.
     * @return Result.
     */
    public int[] sort(int[] array) {
        int temp;
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }
}