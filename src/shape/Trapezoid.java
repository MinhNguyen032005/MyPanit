package shape;

import java.awt.*;

public class Trapezoid extends Shape {
    Point second;
    Point third;
    Point fourth;

    public Trapezoid(Point origin) {
        super(origin);
        this.second = new Point(origin.x + 50, origin.y);
        this.third = new Point(origin.x + 30, origin.y + 50);
        this.fourth = new Point(origin.x - 30, origin.y + 50);
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {origin.x, second.x, third.x, fourth.x};
        int[] yPoints = {origin.y, second.y, third.y, fourth.y};
        g.drawPolygon(xPoints, yPoints, 4);
    }

    @Override
    public void resize(Point point) {
        this.second = new Point(point.x, origin.y);
        this.third = new Point(point.x - 20, point.y); // Điều chỉnh khoảng cách theo ý muốn
        this.fourth = new Point(origin.x - 20, point.y);
    }
}
