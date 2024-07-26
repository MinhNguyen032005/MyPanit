package ourTeam;

import javax.swing.*;
import java.awt.*;

public class MyPanelBot extends JPanel {
    private JLabel label;

    public MyPanelBot() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(label= new JLabel("DRAWING........."));
    }
}
