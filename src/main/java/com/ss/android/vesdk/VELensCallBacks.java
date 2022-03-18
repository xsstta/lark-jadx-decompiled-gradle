package com.ss.android.vesdk;

import com.ss.android.vesdk.VEListener;

public class VELensCallBacks {
    private volatile VEListener.AbstractC63878u mLensStateListener;

    public void setmLensStateListener(Object obj) {
        this.mLensStateListener = (VEListener.AbstractC63878u) obj;
    }

    public static boolean onAlgorithmProcess(Object obj, int i) {
        if (!(obj instanceof VELensCallBacks)) {
            return false;
        }
        VELensCallBacks vELensCallBacks = (VELensCallBacks) obj;
        if (vELensCallBacks.mLensStateListener == null || !vELensCallBacks.mLensStateListener.mo220858a(i)) {
            return false;
        }
        return true;
    }
}
