package controller;

import ourTeam.*;
import shape.*;
import shape.Rectangle;
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
//    private MyPanelPaint panelPaint;
    private MyMainPanel myMainPanel;
    private CustomPanel customPanel;

    Point pointStart;
    Point pointEnd;
    boolean start;
    String titleShape;
    shape.Shape lastShape;

    public ActionWhenPaint() {
        panelLeft = new MyPanelLeft(this);
        customPanel = new CustomPanel(this);
//        panelPaint = new MyPanelPaint(customPanel);
        panelTop= new MyPanelTop(this);
        myMainPanel= new MyMainPanel(panelLeft,customPanel,panelTop);
        new MyFrame(myMainPanel);
    }

    // chuc nang ve
    @Override
    public MouseAdapter paintListener() {
        return new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
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
//                    panelPaint.repaint();
                    switch (titleShape) {
                        case "Ellipse":
                            lastShape = (new Ellipse(new Point(e.getX(), e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Rhombus":
                            lastShape = (new Rhombus(new Point(e.getX(), e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Triangle":
                            lastShape = (new Triangle(new Point(e.getX(), e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Star":
                            lastShape = (new Star(new Point(e.getX(), e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Line":
                            lastShape = (new Line(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Rec":
                            lastShape = (new Rectangle(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Trapezoid":
                            lastShape = (new Trapezoid(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "RoundedSquare":
                            lastShape = (new RoundedSquare(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "SQuare":
                            lastShape = (new Square(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                        case "Oval":
                            lastShape = (new Oval(new Point(e.getX(),e.getY())));
                            customPanel.getShapes().add(lastShape);
                            break;
                    }
                    System.out.println(customPanel.getShapes());
                }
//                panelPaint.repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
//                super.mouseMoved(e);
                if (start && lastShape != null) {
//                    Shape s= panelPaint.getShapes().get(panelPaint.getShapes().size()-1);
                    lastShape.resize(new Point(e.getX(), e.getY()));
                    customPanel.repaint();
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
                else if (string.equals("Star")) titleShape = "Star";
                else if (string.equals("Trapezoid")) titleShape="Trapezoid";
                else if (string.equals("RoundedSquare")) titleShape="RoundedSquare";
            }
        };
    }

    public static void main(String[] args) {
        new ActionWhenPaint();
    }

}
