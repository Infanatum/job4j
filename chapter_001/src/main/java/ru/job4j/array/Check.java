package ru.job4j.array;

/**
 * Class Check is intended to check whether the array
 * filled by only true or false values.
 *
 * @author Infanatum
 * @version 2
 * @since 01.09.2018
 */
public class Check {
    /**
     * Checking content of the array for only true or false values.
     *
     * @param data Source array.
     * @return Result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}