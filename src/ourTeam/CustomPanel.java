package ourTeam;

import controller.IController;
import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CustomPanel extends JPanel {
    private final int SQUARE_SIZE = 20;
    private double scaleFactor = 1.0;
    private IController controller;
    ArrayList<shape.Shape> shapes;

    // them actionListener ne
    public CustomPanel(IController controller) {
        shapes = new ArrayList<>();
        setPreferredSize(new Dimension(1000, 1000));
        this.controller = controller;
        this.addMouseListener(this.controller.paintListener());
        this.addMouseMotionListener(this.controller.paintListener());
    }
//        public  void zoomIn(){
//            scalefactor *= 1.1;// increase the scale factor by 10%
//            revalidate();
//            repaint();
//        }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.YELLOW);
//            int width = getWidth();
//            int height = getHeight();
//
//            for (int x = 0; x < width; x += SQUARE_SIZE) {
//                for (int y = 0; y < height; y += SQUARE_SIZE) {
//                    g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
//                }
//            }
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
