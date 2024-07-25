package myPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class PanelLeft extends JPanel {
    private  JPanel panelLeft;
    private JButton[] blocks;
    private JButton btnLine, btnSquare, btnOval, btnRectangle, btnEcllipse, btnRhombus, btnTriangle, btnSquareOval;
    private ImageIcon[] icons;

    public PanelLeft() {
        URL url1 = Thanh_Truc.class.getResource("/img/newLine_icon.png");
        Image img1 = Toolkit.getDefaultToolkit().createImage(url1);
        ImageIcon icon1 = new ImageIcon(img1);
        URL url2 = Thanh_Truc.class.getResource("/img/icon_Rectangle.png");
        Image img2 = Toolkit.getDefaultToolkit().createImage(url2);
        ImageIcon icon2 = new ImageIcon(img2);
        URL url3 = Thanh_Truc.class.getResource("/img/oval-icon.png");
        Image img3 = Toolkit.getDefaultToolkit().createImage(url3);
        ImageIcon icon3 = new ImageIcon(img3);
        URL url4 = Thanh_Truc.class.getResource("/img/square-icon.png");
        Image img4 = Toolkit.getDefaultToolkit().createImage(url4);
        ImageIcon icon4 = new ImageIcon(img4);
        URL url5 = Thanh_Truc.class.getResource("/img/icon_ecllip.png");
        Image img5 = Toolkit.getDefaultToolkit().createImage(url5);
        ImageIcon icon5 = new ImageIcon(img5);
        URL url6 = Thanh_Truc.class.getResource("/img/rhombus-icon.png");
        Image img6 = Toolkit.getDefaultToolkit().createImage(url6);
        ImageIcon icon6 = new ImageIcon(img6);
        URL url7 = Thanh_Truc.class.getResource("/img/triangle-icon.png");
        Image img7 = Toolkit.getDefaultToolkit().createImage(url7);
        ImageIcon icon7 = new ImageIcon(img7);
        URL url8 = Thanh_Truc.class.getResource("/img/icon_tronV.png");
        Image img8 = Toolkit.getDefaultToolkit().createImage(url8);
        ImageIcon icon8 = new ImageIcon(img8);

        icons = new ImageIcon[]{icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8};

        panelLeft = new JPanel(new GridLayout(12, 1, 2, 2));
        blocks = new JButton[]{btnLine, btnSquare, btnOval, btnRectangle, btnEcllipse, btnRhombus, btnTriangle, btnSquareOval};
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new JButton();
            blocks[i].setSize(new Dimension(50, 50));
            panelLeft.add(blocks[i]);
        }
        for (int i = 0; i < icons.length; i++) {
            blocks[i].setIcon(icons[i]);
        }

        panelLeft.setBackground(Color.lightGray);
    add(panelLeft);
    }
}
