package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Infanatum (mailto:infanatum@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Creating three objects of the Class Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        // Create object triangle and pass in it Paint objects.
        Triangle triangle = new Triangle(a, b, c);
        // Calculate area of a triangle.
        double result = triangle.area();
        // Set expected result.
        double expected = 2D;
        // Check result and expected value.
        assertThat(result, closeTo(expected, 0.1));
    }
}