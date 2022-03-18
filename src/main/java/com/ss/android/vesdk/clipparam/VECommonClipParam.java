package com.ss.android.vesdk.clipparam;

import com.ss.android.vesdk.ROTATE_DEGREE;

public class VECommonClipParam {
    public String mp4DecryptionKey;
    public String path;
    public int seqIn = -1;
    public int seqOut = -1;
    public double speed = 1.0d;
    public int trimIn = -1;
    public int trimOut = -1;
    public int videoClipRotate = ROTATE_DEGREE.ROTATE_NONE.ordinal();

    public String toString() {
        return "VECommonClip{trimIn=" + this.trimIn + ", trimOut=" + this.trimOut + ", path='" + this.path + '\'' + ", mp4DecryptionKey='" + this.mp4DecryptionKey + '\'' + ", speed=" + this.speed + ", seqIn=" + this.seqIn + ", seqOut=" + this.seqOut + ", videoClipRotate=" + this.videoClipRotate + '}';
    }
}
