package ru.job4j.condition;

/**
 * Class Triangle calculates the area of a triangle.
 *
 * @author Infanatum
 * @version 2
 * @since 28.08.2018
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method calculates half-perimeter through thee points.
     * Formula: (ab + ac + bc) / 2.
     *
     * @param ab distance between points a and b.
     * @param ac distance between points a and c.
     * @param bc distance between points b and c.
     * @return Perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Method calculates the area of a triangle.
     *
     * @return Returns area if exist, else returns -1.
     */
    public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            // Using Gerone formula for calculating the area of a triangle.
            rsl = Math.sqrt(
                    (p * (p - ab) * (p - bc) * (p - ac))
            );
        }
        return rsl;
    }

    /**
     * Method checks possibility of building a triangle.
     *
     * @param ab distance between points a and b.
     * @param ac distance between points a and c.
     * @param bc distance between points b and c.
     * @return - returns whether triangle exists or not.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}