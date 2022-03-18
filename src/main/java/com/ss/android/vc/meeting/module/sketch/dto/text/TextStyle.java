package com.ss.android.vc.meeting.module.sketch.dto.text;

public class TextStyle {
    public long color;
    public float size;

    public String toString() {
        return "TextStyle { color: " + this.color + ", size: " + this.size + ", }";
    }

    public TextStyle(long j, float f) {
        this.color = j;
        this.size = f;
    }
}
