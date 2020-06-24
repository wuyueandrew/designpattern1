package indi.wuyue.designpattern1.gui;

import javax.swing.*;

public class Button extends JButton implements GUINode {

    private String name;

    public Button(String text, String name) {
        super(text);
        this.name = name;
    }

    @Override
    public void printNode() {
        System.out.println("print " + name);
    }

}
