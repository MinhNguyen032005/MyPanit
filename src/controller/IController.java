package controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public interface IController {
    MouseAdapter paintListener();

    ActionListener selectButton();

    ActionListener buttonDelete();

    ActionListener undoButtonListener();

    ActionListener redoButton();

    ActionListener selectButtonColor();

    ActionListener selectJMenubar();
}
