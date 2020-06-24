package indi.wuyue.designpattern1.basic;

public class CheckBox extends AbstractGUINode {

    public CheckBox(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }
}
