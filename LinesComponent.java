//package com.java2s;
import java.awt.*;
import java.awt.geom.Line2D;

public class LinesComponent {

    public static void drawGrid(Graphics2D g, int x, int y, int cellWidth,
            int cellHeight, int rows, int columns) {
        for (int i = 0; i <= columns; i++) {
            g.draw(new Line2D.Double(x + cellWidth * i, y, x + cellWidth
                    * i, y + rows * cellHeight));
        }
        for (int i = 0; i <= rows; i++)
            g.draw(new Line2D.Double(x, y + cellHeight * i, x + columns
                    * cellWidth, y + cellHeight * i));
    }
    public static void main(String[] args)
    {
        return drawGrid("blue", 3, 4, 10, 29,3, 4);
    }

}
