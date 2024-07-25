package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLine extends JButton {
    Point p;

    public MyLine(Point p) {
        this.p = p;
    }

    public ActionListener listener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }
}
