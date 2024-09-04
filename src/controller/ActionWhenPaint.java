package controller;

import ourTeam.*;
import shape.*;
import shape.Rectangle;
import shape.Shape;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
    private MyMenuBar menuBar;

    Point pointStart;
    Point pointEnd;
    boolean start;
    String titleShape;
    shape.Shape lastShape;
    Color color;
    JFileChooser c = new JFileChooser();

    private ArrayList<Shape> undoStack = new ArrayList<>();
    private ArrayList<Shape> redoStack = new ArrayList<>();


    public ActionWhenPaint() {
        panelLeft = new MyPanelLeft(this);
        customPanel = new CustomPanel(this);
        panelTop = new MyPanelTop(this);
        menuBar = new MyMenuBar(this);
        myMainPanel = new MyMainPanel(panelLeft, customPanel, panelTop);
        new MyFrame(myMainPanel, this);
    }

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
                switch (e.getActionCommand()) {
                    case "Red":
                        color = Color.red;
                        break;
                    case "Green":
                        color = Color.green;
                        break;
                    case "Blue":
                        color = Color.blue;
                        break;
                    case "Black":
                        color = Color.BLACK;
                        break;
                    case "White":
                        color = Color.white;
                        break;
                    case "Pink":
                        color = Color.pink;
                        break;
                    case "Gray":
                        color = Color.gray;
                        break;
                    case "Yellow":
                        color = Color.yellow;
                        break;
                }
            }
        };
    }

    @Override
    public ActionListener selectJMenubar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if ("Save".equals(command)) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException g) {
                        g.printStackTrace();
                    }
                    BufferedImage image = new BufferedImage(customPanel.getWidth(), customPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2d = image.createGraphics();
                    customPanel.paint(g2d);
                    g2d.dispose();

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Chọn nơi lưu ảnh");
                    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Images", "png"));

                    int userSelection = fileChooser.showSaveDialog(null);
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        File fileToSave = fileChooser.getSelectedFile();
                        if (!fileToSave.getName().endsWith(".png")) {
                            fileToSave = new File(fileToSave.getAbsolutePath() + ".png");
                        }
                        try {
                            File file = new File("saved_image.png");
                            File parentDir = file.getParentFile();
                            if (parentDir != null) {
                                parentDir.mkdirs();
                            }
                            ImageIO.write(image, "png", fileToSave);
                            System.out.println("Image saved successfully.");
                        } catch (IOException g) {
                            g.printStackTrace();
                        }
                    } else if ("Exit".equals(command)) {
                        System.exit(0);
                    }
                }
            }

        };
    }


    public static void main(String[] args) {
        new ActionWhenPaint();
    }

}
