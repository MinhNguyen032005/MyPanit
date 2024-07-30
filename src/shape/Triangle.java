package shape;

import java.awt.*;

public class Triangle extends Shape {
    Point point;
    Color color;

    public Triangle(Point origin, Color color) {
        super(origin, color);
        point = new Point(origin.x, origin.y);
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(color);

        int[] xPoints = {origin.x, origin.x - point.x / 2, origin.x + point.x / 2};
        int[] yPoints = {origin.y - point.y / 2, origin.y + point.y / 2, origin.y + point.y / 2};

        g2d.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void resize(Point newPoint) {
        this.point.x = Math.abs(newPoint.x - origin.x) * 2;
        this.point.y = Math.abs(newPoint.y - origin.y) * 2;
    }
}
