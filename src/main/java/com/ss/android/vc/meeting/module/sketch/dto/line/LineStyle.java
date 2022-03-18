package com.ss.android.vc.meeting.module.sketch.dto.line;

public class LineStyle {
    public long color;
    public float size;

    public String toString() {
        return "LineStyle { color: " + this.color + ", size: " + this.size + ", }";
    }

    public LineStyle(long j, float f) {
        this.color = j;
        this.size = f;
    }
}
