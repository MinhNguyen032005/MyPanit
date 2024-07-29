package ourTeam;



import controller.IController;
import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanelPaint extends JPanel {
//     JScrollPane scrollPane;
//     double scalefactor = 1.0 ;
//     private CustomPanel customPanel;
////    ArrayList<shape.Shape> shapes;
//
//
//    public MyPanelPaint(CustomPanel customPanel) {
//
//        this.customPanel= customPanel;
//        scrollPane = new JScrollPane();
//        customPanel.setBackground(Color.white);
//        scrollPane = new JScrollPane(customPanel);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        setLayout(new BorderLayout());
//        add(scrollPane, BorderLayout.CENTER);
//    }
//
//    public void zoomIn() {
//        scalefactor *= 1.1 ;// Increase the scale factor by 10%
//        revalidate();
//        repaint();
//
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        // Apply scaling
//        g2d.scale(scalefactor, scalefactor);
//        //Exmaple:  draw something for demonstration
//        g2d.fillRect(50, 50, 200, 200);
//    }
//
//
////    public   class CustomPanel extends JPanel {
////        private final int SQUARE_SIZE = 20;
////        private double scaleFactor = 1.0 ;
////        private IController controller;
////        // them actionListener ne
////        public CustomPanel(IController controller) {
////            shapes=new ArrayList<>();
////            setPreferredSize(new Dimension(1000, 1000));
////            this.controller=controller;
////            this.addMouseListener(this.controller.paintListener());
////
////        }
//////        public  void zoomIn(){
//////            scalefactor *= 1.1;// increase the scale factor by 10%
//////            revalidate();
//////            repaint();
//////        }
////
////        @Override
////        protected void paintComponent(Graphics g) {
////            super.paintComponent(g);
////            setBackground(Color.BLUE);
//////            int width = getWidth();
//////            int height = getHeight();
//////
//////            for (int x = 0; x < width; x += SQUARE_SIZE) {
//////                for (int y = 0; y < height; y += SQUARE_SIZE) {
//////                    g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
//////                }
//////            }
////            for (Shape shape : shapes) {
////                shape.draw(g);
////            }
//////            System.out.println(shapes);
////
////        }
////    }
//
//
//    @Override
//    public Dimension getPreferredSize() {
//        return new Dimension((int) (800*scalefactor),(int) (600*scalefactor));
//    }
}
