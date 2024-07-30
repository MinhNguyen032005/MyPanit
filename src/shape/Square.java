package shape;

import java.awt.*;

public class Square extends Shape {
    Point second;
    Color color;

    public Square(Point origin, Color color) {
        super(origin, color);
        second = new Point(origin.x, origin.y);
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        int x = Math.min(origin.x, second.x);
        int w = Math.abs(origin.x - second.x);
        int y = Math.min(origin.y, second.y);
        int h = Math.abs(origin.y - second.y);
        g.setColor(color);
        g.drawRect(x, y, w, h);
    }

    @Override
    public void resize(Point point) {
        this.second = point;
    }
}
