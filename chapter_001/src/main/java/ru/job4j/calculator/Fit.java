package ru.job4j.calculator;

/**
 * Class Fit is intended to calculate ideal weight.
 *
 * @author Infanatum
 * @version 1
 * @since 27.08.2018
 */
public class Fit {

    /**
     * Ideal weight for men.
     * @param height height.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Ideal weight for women.
     * @param height height.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}