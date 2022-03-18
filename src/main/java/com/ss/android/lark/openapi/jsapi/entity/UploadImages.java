package com.ss.android.lark.openapi.jsapi.entity;

public class UploadImages implements BaseJSModel {
    private int max;
    private boolean multiple;

    public int getMax() {
        return this.max;
    }

    public boolean isMultiple() {
        return this.multiple;
    }

    public String toString() {
        return "multiple:" + this.multiple + "," + "max:" + this.max;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public void setMultiple(boolean z) {
        this.multiple = z;
    }
}
