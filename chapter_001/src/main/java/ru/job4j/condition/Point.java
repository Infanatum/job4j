package ru.job4j.condition;

/**
 * Class Point describes a point in
 * the coordinate system.
 *
 * @author Infanatum
 * @version 2
 * @since 27.08.2018
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculating point distance.
     *
     * @param that Point.
     * @return Distance.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}