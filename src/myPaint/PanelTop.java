package myPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class PanelTop extends JPanel {
    private JPanel panelTop, panelColor;
    private JCheckBox box;
    private ImageIcon[] icons;
    private JComboBox<ImageIcon> comboBox;
    private JPanel ChooseColor;
    private Color[] colors;
    private JButton[] bangMau;
    private JButton pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8;
    private JButton btnZoom, btnUndo, btnFill, btnClear;

    public PanelTop() {

        //JToolBar
        panelTop = new JPanel();
        panelTop.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelTop.add(box = new JCheckBox("Selected Mode"));
        // them anh vao jcomboBox

        URL url1 = MyFrame.class.getResource("/img/newLine_icon.png");
        Image img1 = Toolkit.getDefaultToolkit().createImage(url1);
        ImageIcon icon1 = new ImageIcon(img1);
        URL url2 = MyFrame.class.getResource("/img/icon_Rectangle.png");
        Image img2 = Toolkit.getDefaultToolkit().createImage(url2);
        ImageIcon icon2 = new ImageIcon(img2);
        URL url3 = MyFrame.class.getResource("/img/oval-icon.png");
        Image img3 = Toolkit.getDefaultToolkit().createImage(url3);
        ImageIcon icon3 = new ImageIcon(img3);
        URL url4 = MyFrame.class.getResource("/img/square-icon.png");
        Image img4 = Toolkit.getDefaultToolkit().createImage(url4);
        ImageIcon icon4 = new ImageIcon(img4);
        URL url5 = MyFrame.class.getResource("/img/icon_ecllip.png");
        Image img5 = Toolkit.getDefaultToolkit().createImage(url5);
        ImageIcon icon5 = new ImageIcon(img5);
        URL url6 = MyFrame.class.getResource("/img/rhombus-icon.png");
        Image img6 = Toolkit.getDefaultToolkit().createImage(url6);
        ImageIcon icon6 = new ImageIcon(img6);
        URL url7 = MyFrame.class.getResource("/img/triangle-icon.png");
        Image img7 = Toolkit.getDefaultToolkit().createImage(url7);
        ImageIcon icon7 = new ImageIcon(img7);
        URL url8 = MyFrame.class.getResource("/img/icon_tronV.png");
        Image img8 = Toolkit.getDefaultToolkit().createImage(url8);
        ImageIcon icon8 = new ImageIcon(img8);

        icons = new ImageIcon[]{icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8};

        panelTop.add(comboBox = new JComboBox<>());
        for (int i = 0; i < icons.length; i++) {
            comboBox.addItem(icons[i]);
        }

        ChooseColor = new JPanel();
        JPanel container = new JPanel(new GridLayout(1, 2, 5, 5));
        container.setBackground(Color.WHITE);
        panelTop.add(container);

        panelTop.setSize(new Dimension(900, 200));
        ChooseColor.setSize(new Dimension(200, 200));
        panelTop.setBackground(Color.WHITE);
        ChooseColor.setBackground(Color.yellow);

        ChooseColor.setSize(100, 200);
        panelColor = new JPanel(new GridLayout(2, 4, 2, 2));
        panelColor.setSize(new Dimension(200, 100));

        colors = new Color[]{Color.red, Color.green, Color.BLUE, Color.BLACK, Color.WHITE, Color.PINK, Color.YELLOW, Color.GRAY};
        bangMau = new JButton[]{pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8};
        for (int i = 0; i < bangMau.length; i++) {
            bangMau[i] = new JButton();
            bangMau[i].setBackground(colors[i]);
            panelColor.add(bangMau[i]);
        }
        container.add(ChooseColor);
        container.add(panelColor);
        URL urlUndo = MyFrame.class.getResource("/img/Undo-icon.png");
        Image imgUndo = Toolkit.getDefaultToolkit().createImage(urlUndo);
        ImageIcon iconUndo = new ImageIcon(imgUndo);

        URL urlRemove = MyFrame.class.getResource("/img/remove_icon.png");
        Image imgremove = Toolkit.getDefaultToolkit().createImage(urlRemove);
        ImageIcon iconRemove = new ImageIcon(imgremove);

        URL urlFill = MyFrame.class.getResource("/img/fill_icon.png");
        Image imgrFill = Toolkit.getDefaultToolkit().createImage(urlFill);
        ImageIcon iconFill = new ImageIcon(imgrFill);
        URL urlRedo = MyFrame.class.getResource("/img/Arrows-Redo-icon.png");
        Image imgRedo = Toolkit.getDefaultToolkit().createImage(urlRedo);
        ImageIcon iconRedo = new ImageIcon(imgRedo);


        panelTop.add(btnZoom = new JButton(iconUndo));
        panelTop.add(btnUndo = new JButton(iconRedo));
        panelTop.add(btnClear = new JButton(iconRemove));

        panelTop.add(btnFill = new JButton(iconFill));
        add(panelTop);

    }
}
