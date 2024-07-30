package shape;

import java.awt.*;

public class Oval extends Shape{
    int radius;
    Color color;

    public Oval(Point origin, Color color) {
        super(origin, color);
        this.radius = 0;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        int x1,y1;
        x1=origin.x-radius;
        y1=origin.y-radius;
        g.setColor(color);
        g.drawOval(x1, y1, radius * 2, radius * 2);
    }

    @Override
    public void resize(Point point) {
        int dx = point.x - origin.x;
        int dy = point.y - origin.y;
        radius = (int) Math.sqrt(dx*dx + dy*dy);
    }

}
