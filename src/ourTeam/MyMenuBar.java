package ourTeam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

//
public class MyMenuBar extends JMenuBar {
    JMenu mFile, mEdit, mFotmat, mView, mColor;
    JMenuItem itemExit;
    JMenuItem itemColor, itemFill;
    JMenuItem itemMap, itemDefault, itemSave, itemZoomIn, itemZoomOut;
    JMenuItem Red, Green, Blue, Black, White, Pink, Yellow, Gray;
    JMenuItem[] containerItem;
    MyPanelPaint panelPaint;

    public MyMenuBar() {

        add(mFile = new JMenu("File"));
        mFile.setMnemonic('F');
        // them item vao menuFile.
        String[] itemsFile = {"Save-icon", "Users-Exit-icon"};
        String[] nameItemFile = {"Save", "Exit"};
        JMenuItem[] items = {itemSave, itemExit};
        for (int i = 0; i < itemsFile.length; i++) {
            URL url = MyMenuBar.class.getResource("/img/" + itemsFile[i] + ".png");
            Image img = Toolkit.getDefaultToolkit().createImage(url);
            ImageIcon icon = new ImageIcon(img);
            items[i] = new JMenuItem(nameItemFile[i], icon);
            if (i == 1) {
                items[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
            }
            // else is write code for itemSave, when click itemSave, it will save file to image.
            else {
//                BufferedImage image = new BufferedImage(panelPaint.getWidth(), panelPaint.getHeight(), BufferedImage.TYPE_INT_RGB);
//                Graphics2D g2d = image.createGraphics();
//                panelPaint.paint(g2d);
//                g2d.dispose();
//
//                // Save file to image.
//                try {
//                    File outPutFile = new File("image.png");
//                    ImageIO.write(image, "png", outPutFile);
//                    JOptionPane.showMessageDialog(null, "Save file success");
//
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                    JOptionPane.showMessageDialog(null, "Error saving image: " + ex.getMessage());
//                }
            }
            mFile.add(items[i]);
        }



    }


}
