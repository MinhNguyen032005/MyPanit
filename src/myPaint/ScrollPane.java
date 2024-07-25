package myPaint;

import myPaint.shape.Oval;
import myPaint.shape.Rhombus;
import myPaint.shape.Square;
import myPaint.shape.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ScrollPane extends JPanel {
    private JScrollPane scrollPane;

    public ScrollPane() {
        scrollPane = new JScrollPane();

        CustomPanel customPanel = new CustomPanel();
        customPanel.setBackground(Color.black);
        scrollPane = new JScrollPane(customPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);


    }

    class CustomPanel extends JPanel {
        private final int SQUARE_SIZE = 20;

        public CustomPanel() {
            setPreferredSize(new Dimension(1000, 1000));


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
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }
    }



}
