package shape;

import java.awt.*;

public class Square  extends Shape{
    Point second;


    public Square(Point origin) {
        super(origin);
        this.second = new Point(origin.x,origin.y);
    }

    @Override
    public void draw(Graphics g) {
        int x = Math.min(origin.x, second.x);
        int w = Math.abs(origin.x - second.x);
        int y = Math.min(origin.y, second.y);
        int h = Math.abs(origin.y - second.y);
        g.drawRect(x, y, w, h);
    }

    @Override
    public void resize(Point point) {
        this.second=point;
    }
}