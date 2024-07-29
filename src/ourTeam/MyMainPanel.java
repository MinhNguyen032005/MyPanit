package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;

public class MyMainPanel extends JPanel {
    IController iController;
    MyPanelPaint panelPaint;
    public MyMainPanel(IController controller) {
        this.iController = controller;
        this.setLayout(new BorderLayout());
        MyPanelTop panelTop = new MyPanelTop(iController);
        MyPanelLeft panelLeft = new MyPanelLeft(iController);
        MyPanelBot panelBot = new MyPanelBot();
        panelPaint = new MyPanelPaint(iController);
//
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelBot, BorderLayout.SOUTH);
        this.add(panelPaint, BorderLayout.CENTER);
    }

    public MyPanelPaint getPanelPaint() {
        return panelPaint;
    }


}
