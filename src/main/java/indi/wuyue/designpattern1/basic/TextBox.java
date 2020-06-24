package indi.wuyue.designpattern1.basic;

public class TextBox extends AbstractGUINode {

    public TextBox(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }
}
