package ru.job4j.array;

/**
 * Class Matrix is intended to create the multiplication table.
 *
 * @author Infanatum
 * @version 1
 * @since 02.09.2018
 */
public class Matrix {
    /**
     * Creating of the multiplication table.
     *
     * @param size Size of a table.
     * @return Result.
     */
    int[][] multiply(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        return table;
    }
}