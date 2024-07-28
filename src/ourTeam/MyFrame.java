package ourTeam;



import controller.ActionWhenPaint;
import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame {
    private MyMainPanel mainPanel;
    private ActionWhenPaint actionWhenPaint;

    public MyFrame() {
        setTitle("Green Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        actionWhenPaint = new ActionWhenPaint();
        mainPanel = new MyMainPanel(actionWhenPaint);

        MyMenuBar menuBar = new MyMenuBar();

        JPanel drawPanel = mainPanel.getPanelPaint().getCustomPanel();
        menuBar.setDrawingPanel(drawPanel);

        this.mainPanel = mainPanel;



        this.setJMenuBar(menuBar);
        getContentPane().add(mainPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();


    }
}
