package com.ss.android.vc.meeting.module.sketch.dto.rect;

public class RectangleStyle {
    public long color;
    public float size;

    public String toString() {
        return "RectangleStyle { color: " + this.color + ", size: " + this.size + ", }";
    }

    public RectangleStyle(long j, float f) {
        this.color = j;
        this.size = f;
    }
}
