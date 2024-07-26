package greenPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GreenPaint extends JFrame {
    private JPanel mainPanel;
    private JMenuBar bar;

    public GreenPaint() {
        setTitle("Green Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
//        setBackground(Color.WHITE);

        bar = new MyMenuBar();
        this.setJMenuBar(bar);


        URL urlTile = GreenPaint.class.getResource("/img/green.jpg");
        Image imgTi = Toolkit.getDefaultToolkit().createImage(urlTile);
        this.setIconImage(imgTi);

        mainPanel = new MainPanel();

        getContentPane().add(mainPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GreenPaint();
    }
    }
