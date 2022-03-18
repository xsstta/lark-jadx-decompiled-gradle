package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.util.io.NonProguard;

public class DriveFgConfig implements NonProguard {
    public boolean mCoverInDoc;
    public int mCoverWidth;

    public String toString() {
        return "DriveFgConfig{mCoverInDoc=" + this.mCoverInDoc + ", mCoverWidth=" + this.mCoverWidth + '}';
    }

    public DriveFgConfig(boolean z, int i) {
        this.mCoverInDoc = z;
        this.mCoverWidth = i;
    }
}
