package ourTeam;


import controller.ActionWhenPaint;
import controller.IController;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyMainPanel mainPanel;
    private IController iController;

    public MyFrame(MyMainPanel mainPanel, IController iController) {
        setTitle("Green Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        MyMenuBar menuBar = new MyMenuBar(iController);
        setJMenuBar(menuBar);
        mainPanel = mainPanel;
        getContentPane().add(mainPanel);
        setResizable(false);
        setVisible(true);
    }
}
