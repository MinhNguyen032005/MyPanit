package ourTeam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;



//
public class MyMenuBar extends JMenuBar {
    private JMenu mFile, mEdit, mFotmat, mView,mColor;
    private JMenuItem itemExit;
    private JMenuItem itemColor, itemFill;
    private JMenuItem  itemMap,itemDefault,itemNew,itemZoomIn,itemZoomOut;
    private JMenuItem Red, Green, Blue, Black, White, Pink, Yellow, Gray;
    private JMenuItem[] containerItem;


    public MyMenuBar() {
        add(mFile = new JMenu("File"));
        mFile.setMnemonic('F');
        // them item vao menuFile.
        String[] itemsFile ={"document-add-icon","Users-Exit-icon"};
        String[] nameItemFile = {"new","Exit"};
        for (int i = 0; i < itemsFile.length; i++) {
            URL url =MyMenuBar.class.getResource("/img/"+itemsFile[i]+".png");
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            ImageIcon icon = new ImageIcon(img);
            JMenuItem item = new JMenuItem(nameItemFile[i],icon);
            mFile.add(item);
            if(i == 1){
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // exit current frame, just close one
                        // if there are more than one frame
//                        MyFrame.exitFrame();
                    }
                });
            }
            else {
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MyFrame.newFrame();
                    }
                });
            }
        }






        add(mEdit = new JMenu("Edit"));
        mEdit.setMnemonic('E');
        mEdit.add(mColor = new JMenu("Color"));
        // them item cho mColor
        String[] itemMau = {"Red","Green","Blue","Black","White","Pink","Yellow","Gray"};
        for (int i = 0; i < itemMau.length; i++) {
            mColor.add(new JMenuItem(itemMau[i]));
        }
        // them item fill vao Edit
         URL urlFill = MyMenuBar.class.getResource("/img/fill20_icon.png");
         Image imgFill = Toolkit.getDefaultToolkit().createImage(urlFill);
         ImageIcon iconFill = new ImageIcon(imgFill);
        mEdit.add(itemFill = new JMenuItem("Fill",iconFill));




        add(mFotmat = new JMenu("Fotmat"));
        mFotmat.setMnemonic('F');
        // add item Cho mFotmat

          // dang luoi
        URL urlMap = MyMenuBar.class.getResource("/img/DangLuoi-icon.png");
        Image imgMap = Toolkit.getDefaultToolkit().createImage(urlMap);
        ImageIcon iconMap = new ImageIcon(imgMap);
        mFotmat.add(itemMap = new JMenuItem("Map",iconMap));
            // dang mac dinh
        mFotmat.add(itemDefault = new JMenuItem("Default"));





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
