package paint;

import javax.swing.*;

public class Pannel extends JPanel{
    MyLine line;
    JPanel panel;

    public Pannel() {
        panel = new JPanel();
        line = new MyLine(null);
        panel.add(line);
    }
}
