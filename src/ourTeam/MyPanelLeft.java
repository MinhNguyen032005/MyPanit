package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;

public class MyPanelLeft extends JPanel {
    IController controller;
    JButton button;
    private JButton btnLine, btnRec, btnOval, btnSQuare, btnEllipse, btnRhombus, btnTriangle, btnSquareOval;
    ImageIcon icon;
    JButton[] btns;


    public MyPanelLeft(IController controller) {
        this.controller = controller;
        setLayout(new GridLayout(10, 1, 5, 5));
        btns = new JButton[]{btnLine, btnRec, btnOval, btnSQuare, btnEllipse, btnRhombus, btnTriangle, btnSquareOval};
        String[] nameIconsShape = {"newLine_icon.png", "icon_Rectangle.png", "oval-icon.png", "square-icon.png", "icon_ecllip.png", "rhombus-icon.png", "triangle-icon.png", "icon_tronV.png"};
        for (int i = 0; i < nameIconsShape.length; i++) {
            URL url = MyPanelLeft.class.getResource("/img/" + nameIconsShape[i]);
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            icon = new ImageIcon(img);
            btns[i] = new JButton(icon);
            button = btns[i];
            if (btns[i].equals(btns[0])) {
                button.setActionCommand("Line");
            } else if (btns[i].equals(btns[1])) {
                button.setActionCommand("Rec");
            } else if (btns[i].equals(btns[3])) {
                button.setActionCommand("SQuare");
            } else if (btns[i].equals(btns[4])) {
                button.setActionCommand("Ellipse");
            } else if (btns[i].equals(btns[2])) {
                button.setActionCommand("Oval");
            } else if (btns[i].equals(btns[5])) {
                button.setActionCommand("Rhombus");
            } else if (btns[i].equals(btns[6])) {
                button.setActionCommand("Triangle");
            } else if (btns[i].equals(btns[7])) {
                button.setActionCommand("SquareOval");
            }
            button.addActionListener(this.controller.selectButton());
            add(button);
        }

//
    }
}
