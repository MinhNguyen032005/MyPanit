package controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public interface IController {
    MouseListener paintListener();
    ActionListener selectButton();
}
