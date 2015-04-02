package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class RectanglesComponent extends JComponent {

    private final LinkedList<Rectangle> rectangles = new LinkedList<Rectangle>();

    public void addRectangle(int x, int y, int w, int h, Color color) {
        rectangles.add(new Rectangle(x, y, w, h, color));
        repaint();
    }

    public void clearRectangles() {
        rectangles.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i = 0, rectanglesSize = rectangles.size();
        while (i < rectanglesSize) {
            Rectangle rect = rectangles.get(i);
            g.setColor(rect.color);
            g.fillRect(rect.x, rect.y, rect.w, rect.h);
            i++;
        }
    }

    private static class Rectangle {
        final int x;
        final int y;
        final int w;
        final int h;
        final Color color;

        public Rectangle(int x, int y, int w, int h, Color color) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }
}