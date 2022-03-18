package com.ss.android.vc.meeting.module.sketch.dto.oval;

public class OvalStyle {
    public long color;
    public float size;

    public String toString() {
        return "OvalStyle { color: " + this.color + ", size: " + this.size + ", }";
    }

    public OvalStyle(long j, float f) {
        this.color = j;
        this.size = f;
    }
}
