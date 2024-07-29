package shape;

import java.awt.*;

public class Rhombus extends Shape{
    Point second;
   Color color;

    public Rhombus(Point origin, Color color) {
        super(origin, color);
        second=new Point(origin.x,origin.y);
        this.color=color;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(color);

        int[] xPoints = {origin.x, origin.x + second.x / 2, origin.x, origin.x - second.x / 2};
        int[] yPoints = {origin.y - second.y / 2, origin.y, origin.y + second.y / 2, origin.y};

        g2d.drawPolygon(xPoints, yPoints, 4);
    }

    @Override
    public void resize(Point newPoint) {
        this.second.x= Math.abs(newPoint.x - origin.x) * 2;
        this.second.y= Math.abs(newPoint.y - origin.y) * 2;
    }
}
