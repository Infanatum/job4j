package ru.job4j.array;

/**
 * Class Square is intended to fill an array with the square of the numbers 1 to n.
 *
 * @author Infanatum
 * @version 1
 * @since 31.08.2018
 */
public class Square {
    /**
     * Filling an array with the square of the numbers 1 to n.
     *
     * @param bound N.
     * @return Array.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}