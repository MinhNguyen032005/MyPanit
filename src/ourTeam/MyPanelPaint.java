package ourTeam;



import controller.IController;

import javax.swing.*;
import java.awt.*;

public class MyPanelPaint extends JPanel {
     JScrollPane scrollPane;
     double scalefactor = 1.0 ;
     private IController controller;
     //cái sân banh để vẽ
    private JPanel customPanel;

    public JPanel getCustomPanel() {
        return customPanel;
    }

    public MyPanelPaint(IController controller) {
        this.controller= controller;
        scrollPane = new JScrollPane();
        customPanel = new CustomPanel(controller);
        customPanel.setBackground(Color.black);

        scrollPane = new JScrollPane(customPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void zoomIn() {
        scalefactor *= 1.1 ;// Increase the scale factor by 10%
        revalidate();
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // Apply scaling
        g2d.scale(scalefactor, scalefactor);
        //Exmaple:  draw something for demonstration
        g2d.fillRect(50, 50, 200, 200);

    }


    public   class CustomPanel extends JPanel {
        private final int SQUARE_SIZE = 20;
        private double scaleFactor = 1.0 ;
        private IController controller;
        // them actionListener ne
        public CustomPanel(IController controller) {
            setPreferredSize(new Dimension(1000, 1000));
            this.controller=controller;
            this.addMouseListener(this.controller.paintListener());

        }
        public  void zoomIn(){
            scalefactor *= 1.1;// increase the scale factor by 10%
            revalidate();
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();


            for (int x = 0; x < width; x += SQUARE_SIZE) {
                for (int y = 0; y < height; y += SQUARE_SIZE) {
                    g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
                }
            }
        }




    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension((int) (800*scalefactor),(int) (600*scalefactor));
    }
}
