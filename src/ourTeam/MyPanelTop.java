package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class MyPanelTop extends JPanel {
    JComboBox comboBox;
    JButton btnRedo, btnUndo, btnDelete, btnFill, btnPencil;
    IController controller;
    MyColorBoard myColorBoard;
//    JButton button;


    public MyPanelTop(IController controller) {
        this.controller = controller;
        setLayout(new FlowLayout(FlowLayout.CENTER));

// them button pencil
        URL urlPencil = MyPanelTop.class.getResource("/img/pencil-icon.png");
        Image imgPencil = Toolkit.getDefaultToolkit().createImage(urlPencil);
        ImageIcon iconPencil = new ImageIcon(imgPencil);
        btnPencil = new JButton(iconPencil);
        this.add(btnPencil);


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
        myColorBoard = new MyColorBoard(controller);
        this.add(myColorBoard);

        // cac nut button
        String[] nameIcon = {"Undo-icon.png", "Arrows-Redo-icon.png", "remove_icon.png", "fill_icon.png"};
        JButton[] btns = {btnUndo, btnRedo, btnDelete, btnFill};
        for (int i = 0; i < nameIcon.length; i++) {
            URL url = MyPanelTop.class.getResource("/img/" + nameIcon[i]);
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            ImageIcon icon = new ImageIcon(img);
            btns[i] = new JButton();
            btns[i].setIcon(icon);

            this.add(btns[i]);
        }
        btns[0].addActionListener(controller.undoButtonListener());
        btns[1].addActionListener(controller.redoButton());
        btns[2].addActionListener(controller.buttonDelete());

    }

    public JButton getBtnRedo() {
        return btnRedo;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

}
