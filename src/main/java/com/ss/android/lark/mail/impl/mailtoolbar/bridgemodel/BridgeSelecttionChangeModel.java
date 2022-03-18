package com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel;

import java.io.Serializable;

public class BridgeSelecttionChangeModel implements Serializable {
    private int left;
    private int top;

    public int getLeft() {
        return this.left;
    }

    public int getTop() {
        return this.top;
    }

    public String toString() {
        return "BridgeSelecttionChangeModel{top='" + this.top + '\'' + '}';
    }

    public void setLeft(int i) {
        this.left = i;
    }

    public void setTop(int i) {
        this.top = i;
    }
}
