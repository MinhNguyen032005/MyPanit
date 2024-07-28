package ourTeam;



import controller.ActionWhenPaint;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyMainPanel mainPanel;
    public MyFrame(MyMainPanel mainPanel) {
        setTitle("Green Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


       this.mainPanel = mainPanel;
        MyMenuBar menuBar = new MyMenuBar(mainPanel.getPanelPaint());
//
        // Ensure panelPaint is properly sized
        System.out.println("Panel width after frame is visible: " + mainPanel.getPanelPaint().getWidth());
        System.out.println("Panel height after frame is visible: " + mainPanel.getPanelPaint().getHeight());

        this.setJMenuBar(menuBar);
        getContentPane().add(mainPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame(new MyMainPanel(new ActionWhenPaint()));
    }
}
