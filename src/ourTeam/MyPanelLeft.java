package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;

public class MyPanelLeft extends JPanel {
    IController controller;
    JButton button;
    private JButton btnLine,btnRec,btnOval,btnSQuare,btnEllipse,btnRhombus,btnTriangle,btnSquareOval,btnHThang,btnSao;
    ImageIcon icon;
    ImageIcon icon1;
    ImageIcon[] iconArray;
    int x;

    public MyPanelLeft(IController controller) {
        this.controller=controller;
        setLayout(new GridLayout(12,1,5,5));
        JButton[] btns = {btnLine,btnRec,btnOval,btnSQuare,btnEllipse,btnRhombus,btnTriangle,btnSquareOval,btnHThang,btnSao};
        String[] nameIconsShape = {"newLine_icon.png","icon_Rectangle.png","oval-icon.png","square-icon.png","icon_ecllip.png","rhombus-icon.png","triangle-icon.png","icon_tronV.png","icon_thang.png","star-24-icon.png"};
        iconArray=new ImageIcon[btns.length];
        for (int i = 0; i < nameIconsShape.length; i++) {
            URL url = MyPanelLeft.class.getResource("/img/"+nameIconsShape[i]);
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            icon = new ImageIcon(img);
            icon1=icon;
            iconArray[i]=icon1;
            button=new JButton();
            btns[i] = new JButton(icon1);
            button=btns[i];
            button.addActionListener(controller.selectButton());
            add(button);
        }

//
    }


    @Override
    public int getX() {
        return x;
    }

    public IController getController() {
        return controller;
    }

    public JButton getButton() {
        return button;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public JButton getBtnLine() {
        return btnLine;
    }

    public ImageIcon[] getIconArray() {
        return iconArray;
    }
}
