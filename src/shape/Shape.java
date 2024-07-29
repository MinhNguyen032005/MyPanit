package shape;

import java.awt.*;

public abstract class Shape {
    Point origin;
    Color color;
//


    public Shape(Point origin, Color color) {
        this.origin = origin;
        this.color = color;
    }

    public abstract void draw(Graphics g);

    public abstract void resize(Point point);

}
