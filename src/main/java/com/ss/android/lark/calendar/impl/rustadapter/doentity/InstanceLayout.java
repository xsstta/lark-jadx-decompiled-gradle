package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class InstanceLayout implements Serializable {
    private float mHeight;
    private String mId;
    private float mWidth;
    private float mXOffset;
    private float mYOffset;
    private int mZIndex;

    public float getHeight() {
        return this.mHeight;
    }

    public String getId() {
        return this.mId;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getXOffset() {
        return this.mXOffset;
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public String toString() {
        return "InstanceLayout{mId='" + this.mId + '\'' + ", mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mXOffset=" + this.mXOffset + ", mYOffset=" + this.mYOffset + ", mZIndex=" + this.mZIndex + '}';
    }

    public InstanceLayout setHeight(float f) {
        this.mHeight = f;
        return this;
    }

    public InstanceLayout setId(String str) {
        this.mId = str;
        return this;
    }

    public InstanceLayout setWidth(float f) {
        this.mWidth = f;
        return this;
    }

    public InstanceLayout setXOffset(float f) {
        this.mXOffset = f;
        return this;
    }

    public InstanceLayout setYOffset(float f) {
        this.mYOffset = f;
        return this;
    }

    public InstanceLayout setZIndex(int i) {
        this.mZIndex = i;
        return this;
    }
}
