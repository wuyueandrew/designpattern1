package indi.wuyue.designpattern1.basic;

public class Picture extends AbstractGUINode {

    public Picture(String name) {
        super(name);
    }

    @Override
    public void printNode() {
        System.out.println(formatName());
    }

}
