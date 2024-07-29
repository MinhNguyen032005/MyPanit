package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorBoard extends JPanel {
    JButton Red,Green,Blue,Black,White,Pink,Yellow,Gray;
    JPanel isSelectedColor,panelColor;
    IController controller;
    JButton button;

    public MyColorBoard(IController controller) {
        this.controller = controller;
        setLayout(new GridLayout(1, 2, 5, 5));
        isSelectedColor = new JPanel();
        isSelectedColor.setBackground(Color.blue);
        this.add(isSelectedColor);
        panelColor = new JPanel(new GridLayout(2, 4, 5, 5));
        JButton[] btns = {Red, Green, Blue, Black, White, Pink, Yellow, Gray};
        String[] str = {"Red","Green","Blue","Black","White","Pink","Yellow","Gray"};
        Color[] colors = {Color.red, Color.green, Color.blue, Color.BLACK, Color.white, Color.pink, Color.yellow, Color.gray};
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton();
            int index = i;
            btns[i].setBackground(colors[i]);
            button = btns[i];
            button.setActionCommand(str[i]);
            panelColor.add(btns[i]);
        }
        this.add(panelColor);
    }


}
