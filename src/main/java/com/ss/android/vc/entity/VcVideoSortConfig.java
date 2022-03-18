package com.ss.android.vc.entity;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.Serializable;

public class VcVideoSortConfig implements Serializable {
    private float factorAS = 1.0f;
    private float factorCamera = 1.0f;
    private float factorIndex = 3.0f;
    private int maxIndex = 5;
    private int timeScope = SmEvents.EVENT_NW;

    public float getFactorAS() {
        return this.factorAS;
    }

    public float getFactorCamera() {
        return this.factorCamera;
    }

    public float getFactorIndex() {
        return this.factorIndex;
    }

    public int getMaxIndex() {
        return this.maxIndex;
    }

    public int getTimeScope() {
        return this.timeScope;
    }

    public String toString() {
        return "VcVideoSortConfig{timeScope=" + this.timeScope + ", maxIndex=" + this.maxIndex + ", factorAS=" + this.factorAS + ", factorIndex=" + this.factorIndex + ", factorCamera=" + this.factorCamera + '}';
    }

    public void setFactorAS(float f) {
        this.factorAS = f;
    }

    public void setFactorCamera(float f) {
        this.factorCamera = f;
    }

    public void setFactorIndex(float f) {
        this.factorIndex = f;
    }

    public void setMaxIndex(int i) {
        this.maxIndex = i;
    }

    public void setTimeScope(int i) {
        this.timeScope = i;
    }
}
