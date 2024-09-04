package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;

public class MyMainPanel extends JPanel {
    MyPanelLeft panelLeft;
    CustomPanel customPanel;
    MyPanelTop panelTop;
    public MyMainPanel(MyPanelLeft panelLeft, CustomPanel customPanel,MyPanelTop myPanelTop) {
        this.setLayout(new BorderLayout());
        this.panelLeft= panelLeft;
        this.panelTop= myPanelTop;
        this.customPanel= customPanel;
        MyPanelBot panelBot = new MyPanelBot();
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelBot, BorderLayout.SOUTH);
        this.add(customPanel, BorderLayout.CENTER);



    }
}
