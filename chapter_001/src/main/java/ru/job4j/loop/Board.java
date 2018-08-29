package ru.job4j.loop;

/**
 * Class Board creates chess board.
 *
 * @author Infanatum
 * @version 1
 * @since 29.08.2018
 */
public class Board {
    /**
     * Method returns chess board.
     *
     * @param width  Width of the chess board.
     * @param height Height of the chess board.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // Move to new line.
            screen.append(ln);
        }
        return screen.toString();
    }
}