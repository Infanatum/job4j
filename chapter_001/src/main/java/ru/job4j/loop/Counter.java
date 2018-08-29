package ru.job4j.loop;

/**
 * Class Max returns max from two numbers.
 *
 * @author Infanatum
 * @version 1
 * @since 29.08.2018
 */
public class Counter {
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}