package myPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MenuBar extends JMenuBar {
    private JMenuBar bar;
    private JMenu mFile, mEdit, mFotmat, mView;
    private JMenuItem itemExit;
    private JMenuItem itemColor, itemFill;

    public MenuBar() {
        bar = new JMenuBar();
        bar.add(mFile = new JMenu("File"));
        mFile.setMnemonic('F');
        mFile.add(itemExit = new JMenuItem("Exit"));
        private JMenu mFile, mEdit, mFotmat, mColor, mView;
        private JMenuItem itemExit;
        private JMenuItem itemFill, itemMap, itemDefault, itemNew, itemZoomIn, itemZoomOut;
        private JMenuItem Red, Green, Blue, Black, White, Pink, Yellow, Gray;
        private JMenuItem[] containerItem;
    public MenuBar() {
            bar = new JMenuBar();
            bar.add(mFile = new JMenu("File"));
            mFile.setMnemonic('F');


            URL urlAddNew = MyFrame.class.getResource("/img/document-add-icon.png");
            Image imgAddNew = Toolkit.getDefaultToolkit().createImage(urlAddNew);
            ImageIcon iconAddNew = new ImageIcon(imgAddNew);

            mFile.add(itemNew = new JMenuItem("New", iconAddNew));
            URL urlExit = MyFrame.class.getResource("/img/Users-Exit-icon.png");
            Image imgExit = Toolkit.getDefaultToolkit().createImage(urlExit);
            ImageIcon iconExit = new ImageIcon(imgExit);
            mFile.add(itemExit = new JMenuItem("Exit", iconExit));


            bar.add(mEdit = new JMenu("Edit"));
            mEdit.setMnemonic('E');


            bar.add(mFotmat = new JMenu("Format"));
            mFotmat.setMnemonic('F');
            URL urlColr = MyFrame.class.getResource("/img/bangMau_icon.png");
            Image imgColr = Toolkit.getDefaultToolkit().createImage(urlColr);
            ImageIcon iconColr = new ImageIcon(imgColr);
            mEdit.add(itemColor = new JMenuItem("Color", iconColr));


            bar.add(mFotmat = new JMenu("Format"));
            mFotmat.setMnemonic('F');
            URL urlMap = MyFrame.class.getResource("/img/DangLuoi-icon.png");
            Image imgMap = Toolkit.getDefaultToolkit().createImage(urlMap);
            ImageIcon iconMap = new ImageIcon(imgMap);
            itemMap = new JMenuItem("Map", iconMap);

            mFotmat.add(itemMap);
            mFotmat.add(itemDefault = new JMenuItem("Default"));


//        URL urlColr = MyFrame.class.getResource("/img/bangMau_icon.png");
//        Image imgColr = Toolkit.getDefaultToolkit().createImage(urlColr);
//        ImageIcon iconColr = new ImageIcon(imgColr);
            mEdit.add(mColor = new JMenu("Color"));
            String[] sym = {"Red", "Green", "Blue", "Black", "White", "Pink", "Yellow", "Gray"};
            containerItem = new JMenuItem[]{Red, Green, Blue, Black, White, Pink, Yellow, Gray};
            for (int i = 0; i < containerItem.length; i++) {
                containerItem[i] = new JMenuItem(sym[i]);

                mColor.add(containerItem[i]);
            }

            URL urlFil = MyFrame.class.getResource("/img/iemFIll_icon.png");
            Image imgFil = Toolkit.getDefaultToolkit().createImage(urlFil);
            ImageIcon iconFil = new ImageIcon(imgFil);
            mEdit.add(itemFill = new JMenuItem("Fill", iconFil));


            bar.add(mView = new JMenu("View"));


            URL urlZoomIn = MyFrame.class.getResource("/img/Zoom-In-icon.png");
            Image imgZoomIn = Toolkit.getDefaultToolkit().createImage(urlZoomIn);
            ImageIcon iconZoomIn = new ImageIcon(imgZoomIn);
            mView.add(itemZoomIn = new JMenuItem("Zoom In", iconZoomIn));

            URL urlZoomOut = MyFrame.class.getResource("/img/Zoom-Out-icon.png");
            Image imgZoomOut = Toolkit.getDefaultToolkit().createImage(urlZoomOut);
            ImageIcon iconZoomOut = new ImageIcon(imgZoomOut);
            mView.add(itemZoomOut = new JMenuItem("Zoom Out", iconZoomOut));

            add(bar);

        }
    }
}
