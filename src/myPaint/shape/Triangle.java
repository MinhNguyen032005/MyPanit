package myPaint.shape;

import java.awt.*;

public class Triangle extends Shape{
    Point point;

    public Triangle(Point origin) {
        super(origin);
        point=new Point(origin.x,origin.y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

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
