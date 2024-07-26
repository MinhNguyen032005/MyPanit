package ourTeam;

import javax.swing.*;
import java.awt.*;

public class MyMainPanel extends JPanel {
    public MyMainPanel() {
        this.setLayout(new BorderLayout());
        MyPanelTop panelTop = new MyPanelTop();
        MyPanelLeft panelLeft = new MyPanelLeft();
        MyPanelBot panelBot = new MyPanelBot();
        MyPanelPaint panelPaint = new MyPanelPaint();
//
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelBot, BorderLayout.SOUTH);
        this.add(panelPaint, BorderLayout.CENTER);



    }
}
