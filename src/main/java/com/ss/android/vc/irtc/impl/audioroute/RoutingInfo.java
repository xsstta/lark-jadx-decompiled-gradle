package com.ss.android.vc.irtc.impl.audioroute;

public class RoutingInfo {
    private int mDefaultRouting = -1;
    private int mForceSpeakerphone = -1;

    public int getDefaultRouting() {
        return this.mDefaultRouting;
    }

    public int getForceSpeakerphone() {
        return this.mForceSpeakerphone;
    }

    public void setDefaultRouting(int i) {
        this.mDefaultRouting = i;
    }

    public void setForceSpeakerphone(int i) {
        this.mForceSpeakerphone = i;
    }
}
