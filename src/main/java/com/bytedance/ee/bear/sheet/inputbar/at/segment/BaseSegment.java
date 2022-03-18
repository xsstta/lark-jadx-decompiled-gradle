package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.bytedance.ee.util.io.NonProguard;

public abstract class BaseSegment implements NonProguard, Cloneable {
    private SegmentStyle style;
    private SegmentType type;

    public abstract String getText();

    public abstract void setText(String str);

    public BaseSegment() {
    }

    public SegmentStyle getStyle() {
        return this.style;
    }

    public SegmentType getType() {
        return this.type;
    }

    public String toString() {
        return getText();
    }

    @Override // java.lang.Object
    public BaseSegment clone() throws CloneNotSupportedException {
        BaseSegment baseSegment = (BaseSegment) super.clone();
        SegmentStyle segmentStyle = this.style;
        if (segmentStyle != null) {
            baseSegment.style = segmentStyle.clone();
        }
        return baseSegment;
    }

    public void setStyle(SegmentStyle segmentStyle) {
        this.style = segmentStyle;
    }

    public void setType(SegmentType segmentType) {
        this.type = segmentType;
    }

    public BaseSegment(SegmentType segmentType, SegmentStyle segmentStyle) {
        this.type = segmentType;
        this.style = segmentStyle;
    }
}
