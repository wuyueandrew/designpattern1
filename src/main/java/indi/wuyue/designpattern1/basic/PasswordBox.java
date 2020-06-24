package indi.wuyue.designpattern1.basic;

public class PasswordBox extends AbstractGUINode {

    public PasswordBox(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }
}
