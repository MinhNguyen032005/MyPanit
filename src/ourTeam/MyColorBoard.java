package ourTeam;

import javax.swing.*;
import java.awt.*;

public class MyColorBoard extends JPanel {
    private JButton Red,Green,Blue,Black,White,Pink,Yellow,Gray;
    private JPanel isSelectedColor,panelColor;

    public MyColorBoard() {
        setLayout(new GridLayout(1,2,5,5));
        isSelectedColor = new JPanel();
        isSelectedColor.setBackground(Color.blue);
        this.add(isSelectedColor);
        panelColor = new JPanel(new GridLayout(2,4,5,5));
        JButton[] btns = {Red,Green,Blue,Black,White,Pink,Yellow,Gray};
        Color[] colors = {Color.red,Color.green,Color.blue,Color.BLACK,Color.white,Color.pink,Color.yellow,Color.gray};
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton();
            btns[i].setBackground(colors[i]);
            panelColor.add(btns[i]);
        }
        this.add(panelColor);



    }
}
