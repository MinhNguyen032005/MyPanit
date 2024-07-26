package greenPaint;

import javax.swing.*;
import java.awt.*;;

public class PanelBot extends JPanel {
    private JPanel panelBot;

    public PanelBot() {
        panelBot = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label1 = new JLabel("DRAWING................");


//        label1.setBackground(Color.lightGray);

//        panelBot.setBackground(Color.WHITE);
        panelBot.add(label1);
        add(panelBot);
    }
}
