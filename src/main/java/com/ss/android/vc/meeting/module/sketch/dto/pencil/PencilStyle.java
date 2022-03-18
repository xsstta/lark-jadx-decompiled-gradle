package com.ss.android.vc.meeting.module.sketch.dto.pencil;

public class PencilStyle {
    public long color;
    public int pencilType;
    public float size;

    public String toString() {
        return "[color = " + this.color + ", size = " + this.size + ", type = " + this.pencilType + "]";
    }

    public PencilStyle(long j, float f, int i) {
        this.color = j;
        this.size = f;
        this.pencilType = i;
    }
}
