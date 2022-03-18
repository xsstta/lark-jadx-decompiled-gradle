package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.AbstractC63934ae;

public class TEAudioUtilsCallback {
    private AbstractC63934ae listener;

    public void onProgressChanged(double d) {
        AbstractC63934ae aeVar = this.listener;
        if (aeVar != null) {
            aeVar.mo221152a(d);
        }
    }

    public void setListener(Object obj) {
        this.listener = (AbstractC63934ae) obj;
    }
}
