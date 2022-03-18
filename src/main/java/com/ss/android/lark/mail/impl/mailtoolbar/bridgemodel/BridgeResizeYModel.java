package com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel;

import java.io.Serializable;

public class BridgeResizeYModel implements Serializable {
    private int height;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "BridgeResizeYModel{height='" + this.height + '\'' + '}';
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
