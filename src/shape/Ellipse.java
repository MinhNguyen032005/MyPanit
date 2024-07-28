package shape;

import java.awt.*;

public class Ellipse extends Shape {
    Point point;

    public Ellipse(Point origin, Point point) {
        super(origin);
        this.point = point;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int x = Math.min(origin.x, point.x);
        int y = Math.min(origin.y, point.y);
        int width = Math.abs(origin.x - point.x);
        int height = Math.abs(origin.y - point.y);

        g2d.drawOval(x, y, width, height);
    }

    @Override
    public void resize(Point point) {
        this.point = point;

    }
}