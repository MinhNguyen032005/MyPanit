package controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public interface IController {
    MouseAdapter paintListener();
    ActionListener selectButton();
}
