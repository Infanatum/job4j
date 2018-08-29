package ru.job4j.loop;

/**
 * Class Factorial calculates factorial of an integer.
 *
 * @author Infanatum
 * @version 1
 * @since 29.08.2018
 */
public class Factorial {
    public int calc(int n) {
        int factorial = 1;

        for (int i = 1; i < n; i++) {
            factorial += factorial * i;
        }

        return factorial;
    }
}