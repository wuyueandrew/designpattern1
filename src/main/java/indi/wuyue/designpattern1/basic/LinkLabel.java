package indi.wuyue.designpattern1.basic;

public class LinkLabel extends AbstractGUINode {

    public LinkLabel(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }

}
