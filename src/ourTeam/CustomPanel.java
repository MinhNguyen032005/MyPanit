package ourTeam;

import controller.IController;
import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

public class CustomPanel extends JPanel {
    private IController controller;
    private ArrayList<shape.Shape> shapes;
    private Cursor pencilCursor;
    public CustomPanel(IController controller) {
        shapes = new ArrayList<>();
        setPreferredSize(new Dimension(1000, 1000));
        this.controller = controller;
        this.addMouseListener(this.controller.paintListener());
        this.addMouseMotionListener(this.controller.paintListener());

        // chuyen chuot thanh cay but chi
        initUI();

    }

    private void initUI() {

        // tao hinh cho con tro tro thanh cay but chi
        URL urlPencil = CustomPanel.class.getResource("/img/"+"pencil-icon.png");
        Image imagePencil = Toolkit.getDefaultToolkit().createImage(urlPencil);
        pencilCursor = Toolkit.getDefaultToolkit().createCustomCursor(imagePencil,new Point(0,0),"Pencil Cursor");
        // Set the custom cursor on the panelPaint
        setCursor(pencilCursor);


    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.YELLOW);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    public Shape getLastShape(){
        if (shapes.isEmpty()){
            return null;
        }
        return shapes.get(shapes.size()-1);
    }



}
