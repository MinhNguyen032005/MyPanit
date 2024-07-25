package myPaint;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Thanh_Truc extends JFrame {

    private JMenuBar bar;
    private JMenu mFile, mEdit, mFotmat, mView;
    private JMenuItem itemExit;
    private JMenuItem itemColor,itemFill;
    private JPanel  mainPanel;

    private JTabbedPane tabbedPane;


    public Thanh_Truc() {
        setTitle("GreenTeaPaint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 550);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // icon title
        URL urlTile = Thanh_Truc.class.getResource("/img/green.jpg");
        Image imgTi = Toolkit.getDefaultToolkit().createImage(urlTile);
        this.setIconImage(imgTi);
        // menuBarr
        bar = new JMenuBar();
        bar.add(mFile = new JMenu("File"));
        mFile.setMnemonic('F');
        mFile.add(itemExit = new JMenuItem("Exit"));


        bar.add(mEdit = new JMenu("Edit"));
        mEdit.setMnemonic('E');


        bar.add(mFotmat = new JMenu("Format"));
        mFotmat.setMnemonic('F');
        URL urlColr = Thanh_Truc.class.getResource("/img/bangMau_icon.png");
        Image imgColr = Toolkit.getDefaultToolkit().createImage(urlColr);
        ImageIcon iconColr = new ImageIcon(imgColr);
        mEdit.add(itemColor = new JMenuItem("Color",iconColr));
        URL urlFil = Thanh_Truc.class.getResource("/img/iemFIll_icon.png");
        Image imgFil = Toolkit.getDefaultToolkit().createImage(urlFil);
        ImageIcon iconFil = new ImageIcon(imgFil);
        mEdit.add(itemFill = new JMenuItem("Fill",iconFil));



        bar.add(mView = new JMenu("View"));
        mView.setMnemonic('V');
        setJMenuBar(bar);

        PanelTop panelTop = new PanelTop();
        ScrollPane scrollPane = new ScrollPane();
        PanelLeft panelLeft = new PanelLeft();
        PanelBot panelBot = new PanelBot();
        //main panel
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(panelLeft, BorderLayout.WEST);
        mainPanel.add(panelTop, BorderLayout.NORTH);
        mainPanel.add(panelBot, BorderLayout.SOUTH);

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", mainPanel);
        tabbedPane.setBackground(Color.lightGray);

        getContentPane().add(tabbedPane);
        setResizable(false);
        setVisible(true);
    }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }
    public static void main(String[] args) {

    new Thanh_Truc();}
    }


