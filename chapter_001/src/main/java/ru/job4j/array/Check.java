package ru.job4j.array;

/**
 * Class Check is intended to check whether the array
 * filled by only true or false values.
 *
 * @author Infanatum
 * @version 1
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
        boolean result = false, temp = data[0];
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[i] == temp) {
                temp = data[i];
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}