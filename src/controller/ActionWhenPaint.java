package controller;

import ourTeam.*;
import shape.Oval;
import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public class ActionWhenPaint implements IController {
    private MouseListener paintCanvas;
    private MyPanelTop panelTop;
    private MyPanelLeft panelLeft;
    private MyColorBoard colorBoard;
    private MyPanelBot panelBot;
    private MyPanelPaint panelPaint;
    Shape lashShape;
    ArrayList<Shape> listShape;

    public ActionWhenPaint() {
        lashShape = null;
        listShape = new ArrayList<>();
        panelLeft = new MyPanelLeft(this);
    }


    @Override
    public MouseListener paintListener() {
        return this.paintCanvas;
    }

    @Override
    public ActionListener selectButton() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JButton jButton=(JButton) e.getSource();
               System.out.println(jButton.getIcon());
            }
        };
    }


}
