package ru.job4j.array;

/**
 * Class Square is intended to find the element in an array.
 *
 * @author Infanatum
 * @version 1
 * @since 01.09.2018
 */
public class FindLoop {
    /**
     * Finding the target element in an array.
     *
     * @param el N.
     * @return Target element.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i != data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}