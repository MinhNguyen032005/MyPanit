package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyColorBoard extends JPanel {
    private JButton Red,Green,Blue,Black,White,Pink,Yellow,Gray;
    private  JPanel isSelectedColor;
    private JPanel panelColor;
    private Color selectedColor = Color.WHITE;
    private IController controller;

    public MyColorBoard(IController controller) {
        this.controller= controller;
        setLayout(new GridLayout(1,2,5,5));
        isSelectedColor = new JPanel();
        isSelectedColor.setBackground(Color.blue);
        this.add(isSelectedColor);
        panelColor = new JPanel(new GridLayout(2,4,5,5));
        JButton[] btns = {Red,Green,Blue,Black,White,Pink,Yellow,Gray};
        Color[] colors = {Color.red,Color.green,Color.blue,Color.BLACK,Color.white,Color.pink,Color.yellow,Color.gray};
        for (int i = 0; i < btns.length; i++) {
            int index = i;
            btns[i] = new JButton();
            btns[i].setBackground(colors[i]);
            selectedColor = colors[index];
            btns[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    isSelectedColor.setBackground(colors[index]);
                }
            });
            panelColor.add(btns[i]);
        }
        this.add(panelColor);


//
    }
}
