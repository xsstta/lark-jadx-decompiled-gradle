package com.ss.android.vc.meeting.module.sketch.dto.arrow;

public class ArrowStyle {
    public long color;
    public float size;

    public String toString() {
        return "ArrowStyle { color: " + this.color + ", size: " + this.size + ", }";
    }

    public ArrowStyle(long j, float f) {
        this.color = j;
        this.size = f;
    }
}
