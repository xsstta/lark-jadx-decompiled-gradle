package com.ss.ttm.player;

public final class PlaybackParams {
    private int mAudioFallbackMode = -1;
    private int mDescribeContents = -1;
    private float mPitch = -1.0f;
    private float mSpeed = -1.0f;

    public PlaybackParams allowDefaults() {
        return this;
    }

    public int describeContents() {
        return this.mDescribeContents;
    }

    public int getAudioFallbackMode() {
        return this.mAudioFallbackMode;
    }

    public float getPitch() {
        return this.mPitch;
    }

    public float getSpeed() {
        return this.mSpeed;
    }

    public PlaybackParams setAudioFallbackMode(int i) {
        this.mAudioFallbackMode = i;
        return this;
    }

    public PlaybackParams setPitch(float f) {
        this.mPitch = f;
        return this;
    }

    public PlaybackParams setSpeed(float f) {
        this.mSpeed = f;
        return this;
    }
}
