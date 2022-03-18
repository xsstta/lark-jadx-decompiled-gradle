package com.ss.android.lark.location.dto;

import java.io.Serializable;

public class LocationImageData implements Serializable, Cloneable {
    private static final long serialVersionUID = -2131021848780457914L;
    private int height;
    private String imagePath;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
