package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class MappingColor implements Serializable {
    private static final long serialVersionUID = 1;
    private int mBackgroundColor = -1;
    private int mEventCardColor = -1;
    private String mEventColorIndex;
    private int mForegroundColor = -1;

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getEventCardColor() {
        return this.mEventCardColor;
    }

    public String getEventColorIndex() {
        return this.mEventColorIndex;
    }

    public int getForegroundColor() {
        return this.mForegroundColor;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setEventCardColor(int i) {
        this.mEventCardColor = i;
    }

    public void setEventColorIndex(String str) {
        this.mEventColorIndex = str;
    }

    public void setForegroundColor(int i) {
        this.mForegroundColor = i;
    }

    public MappingColor(int i, int i2, int i3, String str) {
        this.mBackgroundColor = i;
        this.mForegroundColor = i2;
        this.mEventCardColor = i3;
        this.mEventColorIndex = str;
    }
}
