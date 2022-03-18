package com.ss.android.vesdk.clipparam;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VEClipSourceParam {
    public int clipColorValue;
    public String clipFilePath = "";
    public int clipHeight;
    public int clipRefIndex;
    public String clipSegmentId = "";
    public int clipWidth;
    public int sourceType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TEClipSourceType {
    }

    public String toString() {
        return "VEClipSourceParam{sourceType=" + this.sourceType + ", clipFilePath='" + this.clipFilePath + '\'' + ", clipSegmentId='" + this.clipSegmentId + '\'' + ", clipRefIndex=" + this.clipRefIndex + ", clipColorValue=" + this.clipColorValue + ", clipWidth=" + this.clipWidth + ", clipHeight=" + this.clipHeight + '}';
    }
}
