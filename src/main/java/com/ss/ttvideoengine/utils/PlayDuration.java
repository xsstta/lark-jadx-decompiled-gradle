package com.ss.ttvideoengine.utils;

import android.os.SystemClock;

public class PlayDuration {
    private int mPlayedDuration;
    private long mStartPlayTime;
    private int mState = 2;

    public void clear() {
        this.mPlayedDuration = 0;
        if (this.mState == 1) {
            this.mStartPlayTime = SystemClock.elapsedRealtime();
        }
    }

    public void reset() {
        this.mState = 2;
        this.mPlayedDuration = 0;
        this.mStartPlayTime = 0;
    }

    public void start() {
        if (this.mState == 2) {
            this.mState = 1;
            this.mStartPlayTime = SystemClock.elapsedRealtime();
        }
    }

    public int getPlayedDuration() {
        if (this.mState == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.mStartPlayTime);
            if (i >= 0) {
                this.mPlayedDuration += i;
            }
            this.mStartPlayTime = elapsedRealtime;
        }
        return this.mPlayedDuration;
    }

    public void stop() {
        if (this.mState == 1) {
            this.mState = 2;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.mStartPlayTime);
            if (elapsedRealtime >= 0) {
                this.mPlayedDuration += elapsedRealtime;
            }
        }
    }
}
