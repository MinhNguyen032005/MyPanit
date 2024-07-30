package shape;

import java.awt.*;

public class Star extends Shape {
    Point second;
    Color color;

    public Star(Point origin, Color color) {
        super(origin, color);
        second = new Point(origin.x, origin.y);
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);

        // Calculate the radius based on the distance between origin and second
        int radius = (int) origin.distance(second);
        int innerRadius = radius / 2;

        int[] xPoints = new int[10];
        int[] yPoints = new int[10];

        // Center of the star
        int centerX = origin.x;
        int centerY = origin.y;

        for (int i = 0; i < 10; i++) {
            double angle = Math.toRadians(i * 36);
            int r = (i % 2 == 0) ? radius : innerRadius;
            xPoints[i] = (int) (centerX + r * Math.cos(angle));
            yPoints[i] = (int) (centerY + r * Math.sin(angle));
        }

        g.drawPolygon(xPoints, yPoints, 10);
    }

    @Override
    public void resize(Point point) {
        this.second = point;
    }
}


