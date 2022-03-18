package com.bytedance.bae.router.receiver.base;

import android.content.BroadcastReceiver;

public abstract class BaseAudioDeviceBroadcastReceiver extends BroadcastReceiver {
    private boolean isRegistered;

    public boolean getRegistered() {
        return this.isRegistered;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }
}
