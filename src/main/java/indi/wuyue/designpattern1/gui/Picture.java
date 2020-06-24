package indi.wuyue.designpattern1.gui;

import javax.swing.*;

public class Picture extends JPanel implements GUINode {

    private String name;

    private String labelName;

    public Picture(String name, String labelName) {
        super();
        this.name = name;
        this.labelName = labelName;

        JLabel label = new JLabel(labelName);
        add(label);
    }

    @Override
    public void printNode() {
        System.out.println("print " + name);
    }

}
