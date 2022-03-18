package com.ss.android.vc.meeting.module.sketch.dto;

import android.graphics.PointF;

public class Coord {

    /* renamed from: x */
    public float f159003x;

    /* renamed from: y */
    public float f159004y;

    public PointF toPoint() {
        return new PointF(this.f159003x, this.f159004y);
    }

    public String toString() {
        return "(" + this.f159003x + ", " + this.f159004y + ")";
    }

    public Coord(float f, float f2) {
        this.f159003x = f;
        this.f159004y = f2;
    }
}
