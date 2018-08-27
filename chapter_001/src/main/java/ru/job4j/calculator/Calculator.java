package ru.job4j.calculator;

/**
 * Class Calculator is intended to calculate values.
 *
 * @author Infanatum
 * @version 1
 * @since 27.08.2018
 */
class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        if (second != 0) {
            this.result = first / second;
        } else {
            this.result = 0;
        }
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}