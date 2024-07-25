package paint;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Pannel panel;

    public Frame() throws HeadlessException {

        setTitle("GreenTeaPaint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        panel = new Pannel();
        this.add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Frame test = new Frame();
    }
}
