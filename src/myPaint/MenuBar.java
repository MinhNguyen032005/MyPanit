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


        bar.add(mEdit = new JMenu("Edit"));
        mEdit.setMnemonic('E');


        bar.add(mFotmat = new JMenu("Format"));
        mFotmat.setMnemonic('F');
        URL urlColr = MyFrame.class.getResource("/img/bangMau_icon.png");
        Image imgColr = Toolkit.getDefaultToolkit().createImage(urlColr);
        ImageIcon iconColr = new ImageIcon(imgColr);
        mEdit.add(itemColor = new JMenuItem("Color", iconColr));
        URL urlFil = MyFrame.class.getResource("/img/iemFIll_icon.png");
        Image imgFil = Toolkit.getDefaultToolkit().createImage(urlFil);
        ImageIcon iconFil = new ImageIcon(imgFil);
        mEdit.add(itemFill = new JMenuItem("Fill", iconFil));


        bar.add(mView = new JMenu("View"));
        mView.setMnemonic('V');
        add(bar);

    }
}
