package com.ss.android.vesdk.clipparam;

import com.ss.android.vesdk.VEListener;

public class VEAICutOutClipParam {
    public int archerStrategy = -1;
    public VEListener.AbstractC63880w listener;
    public String mModelPath = "";
    public String mWorkSpace = "";
    public String originPicForMask = "";
    public int trimIn;
    public int trimOut;

    public String toString() {
        return "VEAICutOutClipParam{trimIn=" + this.trimIn + ", maskPath='" + this.mWorkSpace + '\'' + ", mModelPath='" + this.mModelPath + '\'' + ", trimOut='" + this.trimOut + '\'' + ", archerStrategy='" + this.archerStrategy + '\'' + ", originPicForMask='" + this.originPicForMask + '\'' + '}';
    }
}
