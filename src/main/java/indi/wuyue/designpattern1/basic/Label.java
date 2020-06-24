package indi.wuyue.designpattern1.basic;

public class Label extends AbstractGUINode {

    public Label(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }

}
