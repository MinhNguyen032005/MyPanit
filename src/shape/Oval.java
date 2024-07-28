package shape;

import java.awt.*;

public class Oval extends Shape{
    int radius;

    public Oval(Point origin) {
        super(origin);
        this.radius = 0;
    }


    @Override
    public void draw(Graphics g) {
        int x1,y1;
        x1=origin.x-radius;
        y1=origin.y-radius;
        g.drawOval(x1,y1,radius*2,radius*2);
    }

    @Override
    public void resize(Point point) {
        int dx = point.x - origin.x;
        int dy = point.y - origin.y;
        radius = (int) Math.sqrt(dx*dx + dy*dy);
    }

}
