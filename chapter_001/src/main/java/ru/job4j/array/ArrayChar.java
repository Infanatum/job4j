package ru.job4j.array;

/**
 * Class ArrayChar is intended to check
 * prefix of the word.
 *
 * @author Infanatum
 * @version 2
 * @since 01.09.2018
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Check prefix of the word.
     *
     * @param prefix Prefix.
     * @return Whether a word starts from prefix.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < prefix.length(); i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}