package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Converter test
 *
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }

    @Test
    public void when1EuroToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}
