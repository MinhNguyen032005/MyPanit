package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FillActionController implements ActionListener {
    private Boolean isFill = true;

    public Boolean getFill() {
        return isFill;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.isFill = !this.isFill;
    }
}
