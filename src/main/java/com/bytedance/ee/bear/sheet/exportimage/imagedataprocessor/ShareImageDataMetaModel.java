package com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor;

import com.bytedance.ee.util.io.NonProguard;

public class ShareImageDataMetaModel implements NonProguard {
    private int height;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "ShareImageDataMetaModel{width=" + this.width + ", height=" + this.height + '}';
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
