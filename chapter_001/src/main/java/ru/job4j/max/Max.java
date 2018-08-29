package ru.job4j.max;

/**
 * Class Max returns max from two and three numbers.
 *
 * @author Infanatum
 * @version 2
 * @since 28.08.2018
 */
public class Max {
    /**
     * Method returns max number of 2 numbers.
     *
     * @param first  First number.
     * @param second Second number.
     * @return Max number.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Method returns max number of 3 numbers.
     *
     * @param first  First number.
     * @param second Second number.
     * @param third  Third number.
     * @return Max number.
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return max(temp, third);
    }
}