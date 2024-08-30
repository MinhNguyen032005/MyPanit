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
    private MyMainPanel myMainPanel;
    private CustomPanel customPanel;

    Point pointStart;
    Point pointEnd;
    boolean start;
    String titleShape;
    shape.Shape lastShape;
    String titleColor;
    Color color;

    private ArrayList<Shape> undoStack = new ArrayList<>();
    private ArrayList<Shape> redoStack = new ArrayList<>();


    public ActionWhenPaint() {
        panelLeft = new MyPanelLeft(this);
        customPanel = new CustomPanel(this);
        panelTop = new MyPanelTop(this);
        myMainPanel = new MyMainPanel(panelLeft, customPanel, panelTop);
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
                    pointStart = e.getPoint();

                } else {
                    pointEnd = e.getPoint();
                }
                switch (titleShape) {
                    case "Ellipse":
                        lastShape = (new Ellipse(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Rhombus":
                        lastShape = (new Rhombus(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Triangle":
                        lastShape = (new Triangle(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Star":
                        lastShape = (new Star(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Line":
                        lastShape = (new Line(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Rec":
                        lastShape = (new Rectangle(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Trapezoid":
                        lastShape = (new Trapezoid(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "RoundedSquare":
                        lastShape = (new RoundedSquare(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "SQuare":
                        lastShape = (new Square(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                    case "Oval":
                        lastShape = (new Oval(new Point(e.getX(), e.getY()), color));
                        customPanel.getShapes().add(lastShape);
                        break;
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (start && lastShape != null) {
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
                titleShape = e.getActionCommand();
            }
        };
    }

    @Override
    public ActionListener buttonDelete() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customPanel.getShapes().clear();
                customPanel.repaint();
            }
        };
    }

    @Override
    public ActionListener undoButtonListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Shape> shapes = customPanel.getShapes();
                if (!shapes.isEmpty()) {
                    Shape shapeToUndo = shapes.remove(shapes.size() - 1);
                    undoStack.add(shapeToUndo);
                    redoStack.add(shapeToUndo); // Optionally add to redo stack for redo functionality
                    customPanel.repaint();//
                }
            }
        };
    }

    @Override
    public ActionListener redoButton() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!redoStack.isEmpty()) {
                    Shape shapeToRedo = redoStack.remove(redoStack.size() - 1);
                    customPanel.getShapes().add(shapeToRedo);
                    undoStack.add(shapeToRedo); // Optionally add to undo stack for future undo functionality
                    customPanel.repaint();
                }
            }
        };
    }

    @Override
    public ActionListener selectButtonColor() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleColor = e.getActionCommand();
                if (titleColor.equals("Red")) {
                    color = Color.red;
                } else if (titleColor.equals("Green")) {
                    color = Color.green;
                } else if (titleColor.equals("Blue")) {
                    color = Color.blue;
                } else if (titleColor.equals("Black")) {
                    color = Color.BLACK;
                } else if (titleColor.equals("White")) {
                    color = Color.white;
                } else if (titleColor.equals("Pink")) {
                    color = Color.pink;
                } else if (titleColor.equals("Gray")) {
                    color = Color.gray;
                } else if (titleColor.equals("Yellow")) {
                    color = Color.yellow;
                }
            }
        };
    }


    public static void main(String[] args) {
        new ActionWhenPaint();
    }

}
