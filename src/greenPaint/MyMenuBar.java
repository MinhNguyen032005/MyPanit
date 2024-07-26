package greenPaint;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class MyMenuBar extends JMenuBar {
    private JMenuBar bar;
    private JMenu mFile, mEdit, mFotmat, mView,mColor;
    private JMenuItem itemExit;
    private JMenuItem itemColor, itemFill;
    private JMenuItem  itemMap,itemDefault,itemNew,itemZoomIn,itemZoomOut;
    private JMenuItem Red, Green, Blue, Black, White, Pink, Yellow, Gray;
    private JMenuItem[] containerItem;

    public MyMenuBar() {
        bar = new JMenuBar();
        bar.add(mFile = new JMenu("File"));
        mFile.setMnemonic('F');



        URL urlAddNew = MyMenuBar.class.getResource("/img/document-add-icon.png");
        Image imgAddNew = Toolkit.getDefaultToolkit().createImage(urlAddNew);
        ImageIcon iconAddNew = new ImageIcon(imgAddNew);

        mFile.add(itemNew =new JMenuItem("New",iconAddNew));
        URL urlExit= MyMenuBar.class.getResource("/img/Users-Exit-icon.png");
        Image imgExit = Toolkit.getDefaultToolkit().createImage(urlExit);
        ImageIcon iconExit = new ImageIcon(imgExit);
        mFile.add(itemExit = new JMenuItem("Exit",iconExit));


        bar.add(mEdit = new JMenu("Edit"));
        mEdit.setMnemonic('E');



        bar.add(mFotmat = new JMenu("Format"));
        mFotmat.setMnemonic('F');
        URL urlMap = MyMenuBar.class.getResource("/img/DangLuoi-icon.png");
        Image imgMap = Toolkit.getDefaultToolkit().createImage(urlMap);
        ImageIcon iconMap = new ImageIcon(imgMap);
        itemMap = new JMenuItem("Map",iconMap);

        mFotmat.add(itemMap);
        mFotmat.add(itemDefault = new JMenuItem("Default"));

        mEdit.add(mColor = new JMenu("Color"));
        String[] sym = {"Red","Green","Blue","Black","White","Pink","Yellow","Gray"};
        containerItem = new JMenuItem[]{Red, Green, Blue, Black, White, Pink, Yellow, Gray};
        for (int i = 0; i < containerItem.length; i++) {
            containerItem[i] = new JMenuItem(sym[i]);

            mColor.add(containerItem[i]);
        }

        URL urlFil = MyMenuBar.class.getResource("/img/iemFIll_icon.png");
        Image imgFil = Toolkit.getDefaultToolkit().createImage(urlFil);
        ImageIcon iconFil = new ImageIcon(imgFil);
        mEdit.add(itemFill = new JMenuItem("Fill", iconFil));


        bar.add(mView = new JMenu("View"));


        URL urlZoomIn = MyMenuBar.class.getResource("/img/Zoom-In-icon.png");
        Image imgZoomIn = Toolkit.getDefaultToolkit().createImage(urlZoomIn);
        ImageIcon iconZoomIn = new ImageIcon(imgZoomIn);
        mView.add(itemZoomIn = new JMenuItem("Zoom In",iconZoomIn));
        // ZoomOut: có chức năng
        URL urlZoomOut = MyMenuBar.class.getResource("/img/Zoom-Out-icon.png");
        Image imgZoomOut = Toolkit.getDefaultToolkit().createImage(urlZoomOut);
        ImageIcon iconZoomOut = new ImageIcon(imgZoomOut);
        mView.add(itemZoomOut = new JMenuItem("Zoom Out",iconZoomOut));

        add(bar);
    }
    }

