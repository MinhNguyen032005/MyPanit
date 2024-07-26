package ourTeam;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyPanelLeft extends JPanel {
    private JButton btnLine,btnRec,btnOval,btnSQuare,btnEllipse,btnRhombus,btnTriangle,btnSquareOval;
    public MyPanelLeft() {
        setLayout(new GridLayout(10,1,5,5));
        JButton[] btns = {btnLine,btnRec,btnOval,btnSQuare,btnEllipse,btnRhombus,btnTriangle,btnSquareOval};
        String[] nameIconsShape = {"newLine_icon.png","icon_Rectangle.png","oval-icon.png","square-icon.png","icon_ecllip.png","rhombus-icon.png","triangle-icon.png","icon_tronV.png"};
        for (int i = 0; i < nameIconsShape.length; i++) {
            URL url = MyPanelLeft.class.getResource("/img/"+nameIconsShape[i]);
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            ImageIcon icon = new ImageIcon(img);
            btns[i] = new JButton(icon);
            add(btns[i]);
        }
//
    }
}
