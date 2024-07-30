package shape;

import java.awt.*;

public class Rectangle extends Shape {
    int width;
    int height;
    Color color;

    public Rectangle(Point origin, Color color) {
        super(origin, color);
        this.width = 0;
        this.height = 0;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        int x1, y1;
        x1 = origin.x;
        y1 = origin.y;
        g.setColor(color);
        g.drawRect(x1, y1, width, height);
    }

    @Override
    public void resize(Point point) {
        width = Math.abs(point.x - origin.x);
        height = Math.abs(point.y - origin.y);
        if (point.x < origin.x) {
            origin.x = point.x;
        }
        if (point.y < origin.y) {
            origin.y = point.y;
        }
    }
}
