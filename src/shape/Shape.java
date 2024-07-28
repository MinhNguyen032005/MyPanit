package shape;

import java.awt.*;

public abstract class Shape {
    Point origin;
//

    public Shape(Point origin) {
        this.origin = origin;
    }


    public abstract void draw(Graphics g);

    public abstract void resize(Point point);

}
