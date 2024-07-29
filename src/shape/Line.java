package shape;

import java.awt.*;

public class Line extends Shape {
    Point second;
    Color color;

    public Line(Point origin, Color color) {
        super(origin, color);
        this.second = new Point(origin.x, origin.y);
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        g.drawLine(origin.x, origin.y, second.x, second.y);
    }

    @Override
    public void resize(Point point) {
        this.second = point;
    }
}
