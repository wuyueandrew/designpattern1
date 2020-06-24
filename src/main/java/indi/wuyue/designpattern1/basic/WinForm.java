package indi.wuyue.designpattern1.basic;

import indi.wuyue.designpattern1.gui.GUINode;

import java.util.ArrayList;
import java.util.List;

public class WinForm extends AbstractGUINode {

    private List<AbstractGUINode> subNodes;

    public WinForm(String name) {
        super(name);
        subNodes = new ArrayList<>();
    }

    public void addSubNode(AbstractGUINode subNode) {
        subNodes.add(subNode);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
        subNodes.forEach(GUINode::printNode);
    }
}
