package ru.job4j.converter;

/**
 * Class Converter is intended to convert currency.
 *
 * @author Infanatum
 * @version 1
 * @since 27.08.2018
 */
public class Converter {
    private static final int EURO_RATE = 70;
    private static final int USD_RATE = 60;

    /**
     * RUB to EUR conversion.
     *
     * @param value RUB.
     * @return EUR.
     */
    public int rubleToEuro(int value) {
        return value / EURO_RATE;
    }

    /**
     * RUB to USD conversion.
     *
     * @param value RUB.
     * @return USD
     */
    public int rubleToDollar(int value) {
        return value / USD_RATE;
    }

    /**
     * EUR to RUB conversion.
     *
     * @param value EUR.
     * @return RUB.
     */
    public int euroToRuble(int value) {
        return value * EURO_RATE;
    }

    /**
     * USD to RUB conversion.
     *
     * @param value USD.
     * @return RUB
     */
    public int dollarToRuble(int value) {
        return value * USD_RATE;
    }
}
