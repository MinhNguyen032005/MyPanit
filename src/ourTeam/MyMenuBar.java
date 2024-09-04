package ourTeam;

import controller.IController;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyMenuBar extends JMenuBar {
    JMenu mFile;
    JMenuItem itemExit;
    JMenuItem itemSave;
    IController iController;

    public MyMenuBar(IController iController) {
        this.iController = iController;
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
            items[i].setActionCommand(nameItemFile[i]);
            items[i].addActionListener(this.iController.selectJMenubar());
            mFile.add(items[i]);
        }
    }

    public JMenuItem getItemExit() {
        return itemExit;
    }

    public JMenuItem getItemSave() {
        return itemSave;
    }
}
