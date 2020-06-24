package indi.wuyue.designpattern1.gui;

import javax.swing.*;
import java.util.List;

public class Frame extends JPanel implements GUINode {

    private String name;

    private List<GUINode> subNodes;

    @Override
    public void printNode() {
        System.out.println("print " + name);
        subNodes.forEach(GUINode::printNode);
    }
}
