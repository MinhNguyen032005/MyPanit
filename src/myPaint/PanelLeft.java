package myPaint;

import myPaint.shape.*;
import myPaint.shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PanelLeft extends JPanel {
    private JPanel panelLeft;
    private JButton[] blocks;
    private JButton btnLine, btnSquare, btnOval, btnRectangle, btnEcllipse, btnRhombus, btnTriangle, btnSquareOval;
    private ImageIcon[] icons;
    private boolean start;
    private Point pointStart;
    private Point pointEnd;
    private List<Shape> shapeList;
    private Shape lastShape;
    private Icon buttonIcon;

    public PanelLeft() {
        URL url1 = MyFrame.class.getResource("/img/newLine_icon.png");
        Image img1 = Toolkit.getDefaultToolkit().createImage(url1);
        ImageIcon icon1 = new ImageIcon(img1);
        URL url2 = MyFrame.class.getResource("/img/icon_Rectangle.png");
        Image img2 = Toolkit.getDefaultToolkit().createImage(url2);
        ImageIcon icon2 = new ImageIcon(img2);
        URL url3 = MyFrame.class.getResource("/img/oval-icon.png");
        Image img3 = Toolkit.getDefaultToolkit().createImage(url3);
        ImageIcon icon3 = new ImageIcon(img3);
        URL url4 = MyFrame.class.getResource("/img/square-icon.png");
        Image img4 = Toolkit.getDefaultToolkit().createImage(url4);
        ImageIcon icon4 = new ImageIcon(img4);
        URL url5 = MyFrame.class.getResource("/img/icon_ecllip.png");
        Image img5 = Toolkit.getDefaultToolkit().createImage(url5);
        ImageIcon icon5 = new ImageIcon(img5);
        URL url6 = MyFrame.class.getResource("/img/rhombus-icon.png");
        Image img6 = Toolkit.getDefaultToolkit().createImage(url6);
        ImageIcon icon6 = new ImageIcon(img6);
        URL url7 = MyFrame.class.getResource("/img/triangle-icon.png");
        Image img7 = Toolkit.getDefaultToolkit().createImage(url7);
        ImageIcon icon7 = new ImageIcon(img7);
        URL url8 = MyFrame.class.getResource("/img/icon_tronV.png");
        Image img8 = Toolkit.getDefaultToolkit().createImage(url8);
        ImageIcon icon8 = new ImageIcon(img8);

        icons = new ImageIcon[]{icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8};

        shapeList = new ArrayList<Shape>();
        lastShape = null;
        buttonIcon = new ImageIcon();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButton = (JButton) e.getSource();
                if (jButton.getIcon().equals(icon5)) {
                    start = true;
                    buttonIcon = icon5;
                    System.out.println(1);
                }
                if (jButton.getIcon().equals(icon6)) {
                    start = true;
                    buttonIcon = icon6;
                    System.out.println(2);
                }
                if (jButton.getIcon().equals(icon7)) {
                    start = true;
                    buttonIcon = icon7;
                    System.out.println(3);
                }
                if (jButton.getIcon().equals(icon8)) {
                    start = true;
                    buttonIcon = icon8;
                    System.out.println(4);
                }
            }
        };
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!start) {
                    start = true;
                    pointStart = e.getPoint();
                } else {
                    start = false;
                    pointEnd = e.getPoint();
                    repaint();
                }
                if (buttonIcon == icon5) {
                    lastShape = new Oval(new Point(e.getX(), e.getY()));
                    shapeList.add(lastShape);
                } else if (buttonIcon == icon6) {
                    lastShape = new Rhombus(new Point(e.getX(), e.getY()));
                    shapeList.add(lastShape);
                } else if (buttonIcon == icon7) {
                    lastShape = new Triangle(new Point(e.getX(), e.getY()));
                    shapeList.add(lastShape);
                } else if (buttonIcon == icon8) {
                    lastShape = new Square(new Point(e.getX(), e.getY()));
                    shapeList.add(lastShape);
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if (start) {
                    lastShape.resize(new Point(e.getX(), e.getY()));
                    repaint();
                }
            }
        };


        panelLeft = new JPanel(new GridLayout(12, 1, 2, 2));
        blocks = new JButton[]{btnLine, btnSquare, btnOval, btnRectangle, btnEcllipse, btnRhombus, btnTriangle, btnSquareOval};
        for (int i = 0; i < blocks.length; i++) {
            JButton jButton = new JButton();
            blocks[i] = jButton;
            jButton.addActionListener(actionListener);
            jButton.setSize(new Dimension(50, 50));
            panelLeft.add(jButton);
        }
        for (int i = 0; i < icons.length; i++) {
            blocks[i].setIcon(icons[i]);
        }

        panelLeft.setBackground(Color.white);
        add(panelLeft);




    }
}
