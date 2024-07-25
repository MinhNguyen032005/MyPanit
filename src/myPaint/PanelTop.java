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

        URL url1 = MyFrame.class.getResource("/img/icon_Line_Level1.png");
        Image img1 = Toolkit.getDefaultToolkit().createImage(url1);
        ImageIcon icon1 = new ImageIcon(img1);
        URL url2 = MyFrame.class.getResource("/img/icon_Line_level2.png");
        Image img2 = Toolkit.getDefaultToolkit().createImage(url2);
        ImageIcon icon2 = new ImageIcon(img2);
        URL url3 = MyFrame.class.getResource("/img/icon_Line_Level3.png");
        Image img3 = Toolkit.getDefaultToolkit().createImage(url3);
        ImageIcon icon3 = new ImageIcon(img3);

        icons = new ImageIcon[]{icon1, icon2, icon3};

        panelTop.add(comboBox = new JComboBox<>());
        for (int i = 0; i < icons.length; i++) {
            comboBox.addItem(icons[i]);
        }

        ChooseColor = new JPanel();
        JPanel container = new JPanel(new GridLayout(1, 2, 5, 5));
        container.setBackground(Color.white);
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
