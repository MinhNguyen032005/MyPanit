package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;

public class MyPanelLeft extends JPanel {
    IController controller;
    JButton button;
    JButton btnLine, btnRec, btnOval, btnSQuare, btnEllipse, btnRhombus, btnTriangle, btnSquareOval, btnHThang, btnSao;
    ImageIcon icon;
    ImageIcon[] iconArray;

    public MyPanelLeft(IController controller) {
        this.controller = controller;
        setLayout(new GridLayout(12, 1, 5, 5));
        JButton[] btns = {btnLine, btnRec, btnOval, btnSQuare, btnEllipse, btnRhombus, btnTriangle, btnSquareOval, btnHThang, btnSao};
        String[] nameIconsShape = {"newLine_icon.png", "icon_Rectangle.png", "oval-icon.png", "square-icon.png", "icon_ecllip.png", "rhombus-icon.png", "triangle-icon.png", "icon_tronV.png", "icon_thang.png", "star-24-icon.png"};
        iconArray = new ImageIcon[btns.length];
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
            } else if (btns[i].equals(btns[2])) {
                button.setActionCommand("Oval");
            } else if (btns[i].equals(btns[3])) {
                button.setActionCommand("SQuare");
            } else if (btns[i].equals(btns[4])) {
                button.setActionCommand("Ellipse");
            } else if (btns[i].equals(btns[5])) {
                button.setActionCommand("Rhombus");
            } else if (btns[i].equals(btns[6])) {
                button.setActionCommand("Triangle");
            } else if (btns[i].equals(btns[7])) {
                button.setActionCommand("RoundedSquare");
            } else if (btns[i].equals(btns[8])) {
                button.setActionCommand("Trapezoid");
            } else if (btns[i].equals(btns[9])) {
                button.setActionCommand("Star");
            }
            button.addActionListener(this.controller.selectButton());
            add(button);
        }

//
    }
}
