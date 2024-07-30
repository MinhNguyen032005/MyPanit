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
        MyPanelBot panelBot = new MyPanelBot();
        this.customPanel= customPanel;
        this.add(panelTop, BorderLayout.NORTH);
        this.add(this.panelLeft, BorderLayout.WEST);
        this.add(panelBot, BorderLayout.SOUTH);
        this.add( this.customPanel, BorderLayout.CENTER);



    }
}
