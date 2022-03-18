package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.bytedance.ee.util.io.NonProguard;

public class SegmentStyle implements NonProguard, Cloneable {
    private String color;
    private String fontFamily;
    private int fontSize;
    private String fontStyle;
    private int fontWeight;
    private String textDecoration;

    public String getColor() {
        return this.color;
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public String getFontStyle() {
        return this.fontStyle;
    }

    public int getFontWeight() {
        return this.fontWeight;
    }

    public String getTextDecoration() {
        return this.textDecoration;
    }

    @Override // java.lang.Object
    public SegmentStyle clone() throws CloneNotSupportedException {
        return (SegmentStyle) super.clone();
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setFontFamily(String str) {
        this.fontFamily = str;
    }

    public void setFontSize(int i) {
        this.fontSize = i;
    }

    public void setFontStyle(String str) {
        this.fontStyle = str;
    }

    public void setFontWeight(int i) {
        this.fontWeight = i;
    }

    public void setTextDecoration(String str) {
        this.textDecoration = str;
    }
}
