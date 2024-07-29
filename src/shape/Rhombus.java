package shape;

import java.awt.*;

public class Rhombus extends Shape{
    Point second;
    public Rhombus(Point origin) {
        super(origin);
        second=new Point(origin.x,origin.y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);

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
