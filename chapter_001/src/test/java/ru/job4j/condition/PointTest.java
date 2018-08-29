package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    @Test
    public void whenPointA01PointB25ThenOutputDistance() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);
        double expected = 4.4D;
        assertThat(result, closeTo(expected, 0.1));
    }
}