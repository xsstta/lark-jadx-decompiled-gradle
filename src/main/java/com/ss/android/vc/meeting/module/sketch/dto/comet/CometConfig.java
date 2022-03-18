package com.ss.android.vc.meeting.module.sketch.dto.comet;

public class CometConfig {
    public float minDistance;
    public float weakSpeed;

    public String toString() {
        return "CometConfig: {weakSpeed: " + this.weakSpeed + ", minDistance: " + this.minDistance + " }";
    }

    public CometConfig(float f, float f2) {
        this.weakSpeed = f;
        this.minDistance = f2;
    }
}
