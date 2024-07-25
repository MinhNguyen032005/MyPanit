package greenPaint;

import javax.swing.*;
import java.awt.*;
public class MainPanel extends JPanel {
    private JPanel panelTop,panelBot,panelLeft,panelPaint;

    public MainPanel() {
        this.setLayout(new BorderLayout());
        panelTop = new PanelTop();
        panelBot = new PanelBot();
        panelLeft = new PanelLeft();
        panelPaint = new PanelPaint();

        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelBot, BorderLayout.SOUTH);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelPaint, BorderLayout.CENTER);
    }
}
