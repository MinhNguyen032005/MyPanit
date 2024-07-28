package shape;

import java.awt.*;

public class Line extends Shape {
    Point second;

    public Line(Point origin) {
        super(origin);
        this.second = new Point(origin.x, origin.y);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(origin.x, origin.y, second.x, second.y);
    }

    @Override
    public void resize(Point point) {
        this.second = point;
    }
}
