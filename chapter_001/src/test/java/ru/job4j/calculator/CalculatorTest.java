package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Testing of calculator for operations such as addition,
 * subtraction, multiplying and division
 *
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractTenMinusTwoThenEight() {
        Calculator calc = new Calculator();
        calc.subtract(10D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleTenMultiplyTwoThenTwenty() {
        Calculator calc = new Calculator();
        calc.multiple(10D, 2D);
        double result = calc.getResult();
        double expected = 20D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTenDividedTwoThenFive() {
        Calculator calc = new Calculator();
        calc.div(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }
}