package shape;

import java.awt.*;

public class RoundedSquare extends Shape {
    Point second;

    public RoundedSquare(Point origin, Point second) {
        super(origin);
        this.second = new Point(origin.x, origin.y);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Tính toán tọa độ và kích thước của hình vuông
        int x = Math.min(origin.x, second.x);
        int y = Math.min(origin.y, second.y);
        int size = Math.max(Math.abs(origin.x - second.x), Math.abs(origin.y - second.y));

        // Vẽ hình vuông bo góc
        int arcSize = 20; // Bán kính góc bo
        g2d.drawRoundRect(x, y, size, size, arcSize, arcSize);
    }

    @Override
    public void resize(Point point) {
        this.second = point;
    }
}
