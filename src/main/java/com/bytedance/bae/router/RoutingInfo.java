package com.bytedance.bae.router;

public class RoutingInfo {
    private boolean mBTScoEnabled;
    private int mDefaultRouting = -1;
    private int mForceSpeakerphone = -1;

    public boolean getBTScoEnabled() {
        return this.mBTScoEnabled;
    }

    public int getDefaultRouting() {
        return this.mDefaultRouting;
    }

    public int getForceSpeakerphone() {
        return this.mForceSpeakerphone;
    }

    public void setBTScoEnabled(boolean z) {
        this.mBTScoEnabled = z;
    }

    public void setDefaultRouting(int i) {
        this.mDefaultRouting = i;
    }

    public void setForceSpeakerphone(int i) {
        this.mForceSpeakerphone = i;
    }
}
