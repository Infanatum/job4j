package ru.job4j.array;

/**
 * Class ArrayChar is intended to check
 * whether square array is filled with true
 * or false by diagonals
 *
 * @author Infanatum
 * @version 1
 * @since 03.09.2018
 */
public class MatrixCheck {
    /**
     * checking whether square array is filled with true
     * or false by diagonals
     *
     * @param data Source array.
     * @return Array.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int ln = data.length;
        for (int i = 1; i < ln; i++) {
            if (data[0][0] != data[i][i] && data[ln - 1][0] != data[ln - i - 1][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}