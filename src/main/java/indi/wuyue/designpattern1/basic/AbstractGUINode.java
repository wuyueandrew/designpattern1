package indi.wuyue.designpattern1.basic;

import indi.wuyue.designpattern1.gui.GUINode;

public abstract class AbstractGUINode implements GUINode {

    String name;

    private final static String TEMP = "print %s(%s)";

    AbstractGUINode(String name) {
        this.name = name;
    }

    String formatName() {
        return String.format(TEMP, this.getClass().getSimpleName(), name);
    }

}
