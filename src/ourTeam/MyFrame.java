package ourTeam;



import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Green Paint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


        MyMenuBar menuBar = new MyMenuBar();
        MyMainPanel mainPanel = new MyMainPanel();


//
        this.setJMenuBar(menuBar);
        getContentPane().add(mainPanel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    public static void newFrame() {
      new MyFrame();
    }

    public static void closeFrame() {
        System.exit(0);
    }
}
