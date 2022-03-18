package com.ss.android.vesdk;

import com.ss.android.vesdk.VEListener;

public class TEEffectCallback {
    private VEListener.VEEditorEffectListener listener;

    public void setListener(Object obj) {
        this.listener = (VEListener.VEEditorEffectListener) obj;
    }

    public void onDone(int i, boolean z) {
        this.listener.mo220828a(i, z);
    }
}
