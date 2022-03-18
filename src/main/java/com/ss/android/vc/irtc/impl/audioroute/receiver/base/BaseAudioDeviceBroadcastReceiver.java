package com.ss.android.vc.irtc.impl.audioroute.receiver.base;

import android.content.BroadcastReceiver;
import android.os.Looper;
import com.larksuite.framework.thread.CoreThreadPool;

public abstract class BaseAudioDeviceBroadcastReceiver extends BroadcastReceiver {
    private boolean isRegistered;

    public boolean getRegistered() {
        return this.isRegistered;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    /* access modifiers changed from: protected */
    public void run(Runnable runnable) {
        if (Looper.myLooper() == CoreThreadPool.getSerialTaskHandler().getLooper()) {
            runnable.run();
        } else {
            CoreThreadPool.getSerialTaskHandler().post(runnable);
        }
    }
}
