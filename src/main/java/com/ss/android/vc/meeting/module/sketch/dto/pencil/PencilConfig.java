package com.ss.android.vc.meeting.module.sketch.dto.pencil;

public class PencilConfig {
    public float errorGap;

    /* renamed from: k */
    public float f159005k;
    public float minDistance;

    public String toString() {
        return "PencilConfig: {k: " + this.f159005k + ", minDistance: " + this.minDistance + ", errorGap: " + this.errorGap + " }";
    }

    public PencilConfig(float f, float f2, float f3) {
        this.f159005k = f;
        this.minDistance = f2;
        this.errorGap = f3;
    }
}
