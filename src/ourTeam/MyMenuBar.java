package ourTeam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
//
public class MyMenuBar extends JMenuBar {
    private JMenu  mView,mColor;
    private JMenuItem itemExit;
    private JMenuItem itemColor, itemFill;
    private JMenuItem  itemMap,itemDefault,itemNew,itemZoomIn,itemZoomOut;
    private JMenuItem Red, Green, Blue, Black, White, Pink, Yellow, Gray;
    private JMenuItem[] containerItem;


    public MyMenuBar() {

        add(mView = new JMenu("View"));
        mView.setMnemonic('V');
        //them zoom in va zoom out vao mView

        String[] nameItemOfView = {"Zoom In","Zoom out"};
        String[] iconOfView = {"Zoom-In-icon.png","Zoom-Out-icon.png"};
        for (int i = 0; i < nameItemOfView.length; i++) {
           URL url = MyMenuBar.class.getResource("/img/"+iconOfView[i]);
           Image img = Toolkit.getDefaultToolkit().createImage(url);
           ImageIcon icon = new ImageIcon(img);
           mView.add(new JMenuItem(nameItemOfView[i],icon));
        }
    }
}
