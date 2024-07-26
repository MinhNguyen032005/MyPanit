package ourTeam;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyPanelTop extends JPanel {
    private JCheckBox checkBox;
    private JComboBox comboBox;
    private JButton btnRedo, btnUndo, btnDelete, btnFill;

    public MyPanelTop() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(checkBox = new JCheckBox("Selected Mode"));

//
        // add vao comboBox cac duong thang bieu thi dam nhat
        String[] nameIcons = {"icon_Line_Level1.png", "icon_Line_level2.png", "icon_Line_Level3.png"};
        comboBox = new JComboBox();
        for (int i = 0; i < 3; i++) {
            URL url = getClass().getResource("/img/" + nameIcons[i]);
            Image img = Toolkit.getDefaultToolkit().getImage(url);
            ImageIcon icon = new ImageIcon(img);
            comboBox.addItem(icon);
        }

        this.add(comboBox);


        // bang mau de chon
        MyColorBoard colorBoard = new MyColorBoard();
        this.add(colorBoard);

        // cac nut button
        String[] nameIcon = {"Arrows-Redo-icon.png", "Undo-icon.png", "remove_icon.png", "fill_icon.png"};
        JButton[] btns = {btnRedo, btnUndo, btnDelete, btnFill};
        for (int i = 0; i < nameIcon.length; i++) {
            URL url = MyPanelTop.class.getResource("/img/" + nameIcon[i]);
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            ImageIcon icon = new ImageIcon(img);
            btns[i] = new JButton();
            btns[i].setIcon(icon);
            this.add(btns[i]);
        }
    }
}
