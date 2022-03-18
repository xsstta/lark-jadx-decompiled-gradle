package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.VEListener;

public class TEReverseCallback {
    private VEListener.AbstractC63871n listener;

    public void onProgressChanged(double d) {
        VEListener.AbstractC63871n nVar = this.listener;
        if (nVar != null) {
            nVar.mo220850a(d);
        }
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.AbstractC63871n) obj;
    }
}
