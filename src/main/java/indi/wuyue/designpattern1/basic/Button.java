package indi.wuyue.designpattern1.basic;

public class Button extends AbstractGUINode {

    public Button(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }

}
