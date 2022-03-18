package com.ss.texturerender.overlay;

import android.os.SystemClock;
import com.ss.texturerender.TextureRenderLog;

public class NormalClock {
    private boolean mIsUpdated;
    private long mPts;
    private int mStatus = 3;
    private long mUpdateTime;

    public synchronized void pause() {
        this.mStatus = 2;
        this.mUpdateTime = 0;
    }

    public synchronized void start() {
        this.mStatus = 1;
    }

    public synchronized long getClock() {
        long j;
        long j2;
        j = this.mPts;
        j2 = 0;
        if (this.mUpdateTime > 0 && this.mStatus == 1) {
            j2 = SystemClock.elapsedRealtime() - this.mUpdateTime;
        }
        return j + j2;
    }

    public synchronized void stop() {
        this.mStatus = 3;
        this.mUpdateTime = 0;
        this.mIsUpdated = false;
        this.mPts = 0;
    }

    public synchronized void updateClock(long j) {
        TextureRenderLog.m256492d("NormalClock", "updateClock masetr:" + j + " mIsUpdated:" + this.mIsUpdated + " mStatus:" + this.mStatus);
        if (!this.mIsUpdated) {
            this.mIsUpdated = true;
            this.mStatus = 1;
        }
        if (this.mStatus == 1) {
            this.mPts = j;
            this.mUpdateTime = SystemClock.elapsedRealtime();
        }
    }
}
