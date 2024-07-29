package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveActionController implements ActionListener {
    private JPanel drawingPanel;


    public void setDrawingPanel(JPanel drawingPanel) {
        this.drawingPanel = drawingPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SaveImageController.saveDrawingToFile(drawingPanel);
    }

}
