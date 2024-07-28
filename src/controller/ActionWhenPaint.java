package controller;

import ourTeam.*;
import shape.*;
import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Objects;

public class ActionWhenPaint implements IController {
    private MouseListener paintCanvas;
    private MyPanelTop panelTop;
    private MyPanelLeft panelLeft;
    private MyColorBoard colorBoard;
    private MyPanelBot panelBot;
    private MyPanelPaint panelPaint;

    Point pointStart;
    Point pointEnd;
    boolean start;
    String titleShape;
    shape.Shape lastShape;

    public ActionWhenPaint() {
        panelLeft = new MyPanelLeft(this);
        panelPaint=new MyPanelPaint(this);
    }

// chuc nang ve
    @Override
    public MouseListener paintListener() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == e.BUTTON1) {
                    start = true;
                }
                if (e.getButton() == e.BUTTON3) {
                    start = false;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!start) {
                    start = true;
                    pointStart = e.getPoint();
                } else {
                    start = false;
                    pointEnd = e.getPoint();
                    panelPaint.repaint();
                }
                switch (titleShape) {
                    case "Ellipse":
                        lastShape=(new Oval(new Point(e.getX(), e.getY())));
                        panelPaint.getShapes().add(lastShape);
                        System.out.println(1);
//                        System.out.println(panelPaint.getShapes());
                        break;
                    case "Rhombus":
                        lastShape=(new Rhombus(new Point(e.getX(), e.getY())));
                        panelPaint.getShapes().add(lastShape);
                        System.out.println(2);
                        break;
                    case "Triangle":
                        lastShape=(new Triangle(new Point(e.getX(), e.getY())));
                        panelPaint.getShapes().add(lastShape);
                        System.out.println(3);
                        break;
                    case "SquareOval":
                        lastShape=(new Square(new Point(e.getX(), e.getY())));
                        panelPaint.getShapes().add(lastShape);
                        System.out.println(4);
                        break;
                }
                panelPaint.repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if (start) {
                    lastShape.resize(new Point(e.getX(), e.getY()));
                    panelPaint.repaint();
                }
            }
        };
    }
// xu ly nut ben trai, cac nut hinh de ve
    @Override
    public ActionListener selectButton() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = e.getActionCommand();
                if (string.equals("Line")) titleShape = "Line";
                else if (string.equals("Rec")) titleShape = "Rec";
                else if (string.equals("Ellipse")) titleShape = "Ellipse";
                else if (string.equals("SQuare")) titleShape = "SQuare";
                else if (string.equals("Oval")) titleShape = "Oval";
                else if (string.equals("Rhombus")) titleShape = "Rhombus";
                else if (string.equals("Triangle")) titleShape = "Triangle";
                else if (string.equals("SquareOval")) titleShape = "SquareOval";
            }
        };
    }


}
