package ru.job4j.max;

/**
 * Class Max returns ru.job4j.max from two numbers.
 *
 * @author Infanatum
 * @version 1
 * @since 28.08.2018
 */
public class Max {
    /**
     * Return ru.job4j.max number
     *
     * @param first  First number.
     * @param second Second number.
     * @return Max number.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}