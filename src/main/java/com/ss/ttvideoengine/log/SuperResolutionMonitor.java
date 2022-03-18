package com.ss.ttvideoengine.log;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class SuperResolutionMonitor {
    private int mSrAlgorithm = -1;

    public float getHeightFactor() {
        int i = this.mSrAlgorithm;
        if (i == 0) {
            return 2.0f;
        }
        if (i != 4) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return 1.5f;
    }

    public float getWidthFactor() {
        int i = this.mSrAlgorithm;
        if (i == 0) {
            return 2.0f;
        }
        if (i != 4) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return 1.5f;
    }

    public void setAlgorithm(int i) {
        this.mSrAlgorithm = i;
    }
}
