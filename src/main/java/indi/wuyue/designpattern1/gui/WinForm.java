package indi.wuyue.designpattern1.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WinForm extends JFrame implements GUINode {

    private String name;

    private List<GUINode> subNodes;

    public WinForm(String name, Picture picture, Button loginButton, Button registerButton, Frame frame) throws HeadlessException {
        super(name);
        subNodes = new ArrayList<>();
        subNodes.add(picture);
        subNodes.add(loginButton);
        subNodes.add(registerButton);
        subNodes.add(frame);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLayout(new BorderLayout());
        add(picture, BorderLayout.NORTH);
        add(frame, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void add(Component comp, Object constraints) {
        super.add(comp, constraints);

    }

    @Override
    public void printNode() {
        System.out.println("print " + name);
        subNodes.forEach(GUINode::printNode);
    }

}
