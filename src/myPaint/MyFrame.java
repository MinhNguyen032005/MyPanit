package myPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyFrame extends JFrame {
    private JPanel mainPanel;

    private JTabbedPane tabbedPane;



    public MyFrame() {
        setTitle("GreenTeaPaint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);

        // icon title
        URL urlTile = MyFrame.class.getResource("/img/green.jpg");
        Image imgTi = Toolkit.getDefaultToolkit().createImage(urlTile);
        this.setIconImage(imgTi);

        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);
        PanelTop panelTop = new PanelTop();
        ScrollPane scrollPane = new ScrollPane();
        PanelLeft panelLeft = new PanelLeft();
        PanelBot panelBot = new PanelBot();
        //main panel
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(panelLeft, BorderLayout.WEST);
        mainPanel.add(panelTop, BorderLayout.NORTH);
        mainPanel.add(panelBot, BorderLayout.SOUTH);
        mainPanel.setBackground(Color.WHITE);

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", mainPanel);
        tabbedPane.setBackground(Color.WHITE);
        getContentPane().add(tabbedPane);
        setResizable(false);
        setVisible(true);
    }



    public static void main(String[] args) {
        new MyFrame();
    }
}


